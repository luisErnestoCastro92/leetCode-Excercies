package leetcode;

import java.util.Arrays;

public class PermutationDifference {

    public int findPermutationDifference(String s, String t) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    sum += Math.abs(i - j);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new PermutationDifference().findPermutationDifference("abc", "bac"));
    }

}
