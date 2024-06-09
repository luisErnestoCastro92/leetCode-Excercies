package leetcode;

import java.util.Map;

public class PermutationInTwoStrings {

    public int findPermutationDifference(String s, String t) {
        int count = 0;
        char[] charactersInS = s.toCharArray();
        char[] charactersInT = t.toCharArray();
        for (int i = 0; i < charactersInS.length; i++) {
            for (int j = 0; j < charactersInT.length; j++) {
                count += Math.abs(charactersInS[i] - charactersInT[j]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        PermutationInTwoStrings permutation = new PermutationInTwoStrings();
        System.out.print(permutation.findPermutationDifference("abc", "bad"));
    }

}
