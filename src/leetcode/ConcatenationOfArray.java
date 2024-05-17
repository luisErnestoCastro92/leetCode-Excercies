package leetcode;

public class ConcatenationOfArray {

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[nums.length + i] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] ans = ConcatenationOfArray.getConcatenation(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print("[" + ans[i] + "]");
        }
    }

}
