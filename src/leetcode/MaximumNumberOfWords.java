package leetcode;

import java.util.*;

public class MaximumNumberOfWords {

    public int mostWordsFound(String[] sentences) {
        List<Integer> maxValue = new ArrayList<>();
        for (int i = 0; i < sentences.length; i++) {
            String[] word = sentences[i].split(" ");
            maxValue.add(word.length);
        }
        return Collections.max(maxValue);
    }

    public static void main(String[] args) {
        MaximumNumberOfWords numberOfWords = new MaximumNumberOfWords();
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(numberOfWords.mostWordsFound(sentences));
    }
}
