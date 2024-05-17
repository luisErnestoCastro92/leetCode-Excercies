package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!numbers.containsKey(nums[i])) {
                numbers.put(nums[i], i);
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /*Input: nums = [1,2,3,1]
        Output: true*/
        int[] nums = {2, 14, 18, 22, 22};
        System.out.println(containsDuplicate(nums));
    }
}
