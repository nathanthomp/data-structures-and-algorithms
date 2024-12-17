package nathanthomp.algorithms.sort;

import nathanthomp.Testable;

public class MergeSort implements Testable {

    private static int[] merge(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            return nums2;
        } else if (nums2.length == 0) {
            return nums1;
        }

        int[] result = new int[nums1.length + nums2.length];
        int resultIndex = 0, nums1Pointer = 0, nums2Pointer = 0;

        while (nums1Pointer < nums1.length && nums2Pointer < nums2.length) {
            int num1 = nums1[nums1Pointer], num2 = nums2[nums2Pointer];
            if (num1 <= num2) {
                result[resultIndex] = num1;
                nums1Pointer++;
            } else {
                result[resultIndex] = num2;
                nums2Pointer++;
            }

            resultIndex++;
        }

        if (nums1Pointer < nums1.length) {
            while (nums1Pointer < nums1.length) {
                result[resultIndex] = nums1[nums1Pointer];
                nums1Pointer++;
                resultIndex++;
            }
        } else {
            while (nums2Pointer < nums2.length) {
                result[resultIndex] = nums2[nums2Pointer];
                nums2Pointer++;
                resultIndex++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums2 = { 1, 3, 5 }; // 1, 3, 5
        int[] nums1 = { 2, 4, 6 }; // 2, 4, 6
        int[] merged = merge(nums1, nums2);

        System.out.print("[ ");
        for (int i : merged) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    @Override
    public boolean Test() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Test'");
    }
}
