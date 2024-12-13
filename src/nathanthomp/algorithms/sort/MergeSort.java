package nathanthomp.algorithms.sort;

public class MergeSort {

    private static int[] merge(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            return nums2;
        } else if (nums2.length == 0) {
            return nums1;
        }

        int[] result = new int[nums1.length + nums2.length];
        

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {}; // 1, 3, 5
        int[] nums2 = {}; // 2, 4, 6
        int[] merged = merge(nums1, nums2);

        System.out.print("[ ");
        for (int i : merged) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }
}
