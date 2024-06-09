package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {

    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        int checkNumber = 1;
        Arrays.sort(nums);
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[checkNumber] == nums[i]) {
                integerMap.put(0, 0);
            } else if (!integerMap.containsKey(i)) {
                integerMap.put(nums[i], nums[i]);
                sum += integerMap.get(nums[i]);
            }
            checkNumber++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(SumOfUniqueElements.sumOfUnique(new int[]{1, 2, 3, 4, 5}));
    }

}
