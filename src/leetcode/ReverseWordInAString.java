package leetcode;

import java.util.Arrays;

public class ReverseWordInAString {

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            stringBuilder.append(words[i]).append(" ");
        }

        return stringBuilder.toString();
    }

    /*Input: s = "Let's take LeetCode contest" tsetnoc ekat Let's LeetCode
    Output: "s'teL ekat edoCteeL tsetnoc"*/

    public static void main(String[] args) {
        ReverseWordInAString reverseWordInAString = new ReverseWordInAString();
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWordInAString.reverseWords(s));
    }

}
