package leetcode;

import java.util.Arrays;

public class FindTheIntegerAddedToArray {

    public static int addedInteger(int[] nums1, int[] nums2) {
        int addValue = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i = 0; i < nums1.length; i++) {
            addValue = nums2[i] - nums1[i];
        }
        return addValue;
    }

    public static void main(String[] args) {
        int[] nums1 = {10};
        int[] nums2 = {5};
        System.out.print(FindTheIntegerAddedToArray.addedInteger(nums1, nums2));
    }

}
