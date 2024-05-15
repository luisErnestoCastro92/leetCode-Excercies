package leetcode;

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {

        int[] ans = new int[nums.length * 2];
        for (int i = nums.length; i < ans.length; i++) {
            ans[i - nums.length] = nums[i - nums.length];
            ans[i] = nums[i - nums.length];
        }
        return ans;
    }

    public static void main(String[] args) {
        ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();
        int[] nums = {1, 2, 3, 4};
        int[] ans = concatenationOfArray.getConcatenation(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print("[" + ans[i] + "]");
        }
    }

}
