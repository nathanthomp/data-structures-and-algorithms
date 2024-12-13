package nathanthomp.algorithms.array;

public class SlidingWindow {

    private static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;

        for (int leftPointer = 0; leftPointer < nums.length; leftPointer++) {
            if (nums[leftPointer] == 1) {
                currentConsecutiveOnes++;
                for (int rightPointer = leftPointer + 1; rightPointer < nums.length && nums[rightPointer] != 0; rightPointer++) {
                    currentConsecutiveOnes++;
                }
            }
            
            if (maxConsecutiveOnes == nums.length){
                return maxConsecutiveOnes;
            }
            
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);
            currentConsecutiveOnes = 0;
        }
        return maxConsecutiveOnes;
    }

    public static void main(String[] args) {
        int[] array = {1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(array));
    }
}