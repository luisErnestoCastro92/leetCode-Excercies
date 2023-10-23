package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimized {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);// nums[i] = 2, i=0|nums[i] = 7, i=1
            System.out.println("ComplementIndex: " + complementIndex);
            if (complementIndex != null) {
                return new int[]{i, complementIndex};
            }
            complements.put(target - nums[i], i);//(9-2) = 7, 0
        }
        return nums;
    }

    public static void main(String[] args) {
        TwoSumOptimized twoSum = new TwoSumOptimized();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] indices = twoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(indices));
    }
}
