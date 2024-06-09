package leetcode;

import java.util.Arrays;

public class SortingTheSentence {

    public String sortSentence(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = s.split(" ");
        String[] sortedWords = new String[words.length];

        return Arrays.toString(sortedWords);
    }

    public static void main(String[] args) {
        SortingTheSentence sortingTheSentence = new SortingTheSentence();
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortingTheSentence.sortSentence(s));
    }

}
