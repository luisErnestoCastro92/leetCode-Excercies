package leetcode;

import java.util.Arrays;

public class CheckIfTwoStringArraysAreEquivalent {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder stringBuilderWord1 = new StringBuilder();
        StringBuilder stringBuilderWord2 = new StringBuilder();

        for (String word : word1) {
            stringBuilderWord1.append(word);
        }

        for (String word : word2) {
            stringBuilderWord2.append(word);
        }

        return stringBuilderWord1.toString().equals(stringBuilderWord2.toString());
    }

    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        System.out.println(CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(word1, word2));

    }

}
