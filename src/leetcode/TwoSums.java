package leetcode;

import java.util.Arrays;

public class TwoSums {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = nums.length - 1; j >= 1; j--) {
                if ((nums[i] + nums[j]) == target && i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(TwoSums.twoSum(new int[]{1, 3, 4, 2}, 6)));
    }

}
