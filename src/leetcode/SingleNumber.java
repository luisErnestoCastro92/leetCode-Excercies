package leetcode;

import java.util.Arrays;

public class SingleNumber {

    public static int singleNumber(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        SingleNumber.singleNumber("hola mundo");
    }
}
