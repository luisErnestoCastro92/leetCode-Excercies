package leetcode;

import java.util.Arrays;
import java.util.List;

public class AcronymOfWords {

    public static boolean isAcronym(List<String> words, String s) {
        StringBuilder firstCharacter = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            firstCharacter.append(words.get(i).toLowerCase().charAt(0));
        }
        return firstCharacter.toString().equals(s);
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Alice", "Bob", "Charlie");
        String s = "abg";
        System.out.println(AcronymOfWords.isAcronym(words, s));
    }

}
