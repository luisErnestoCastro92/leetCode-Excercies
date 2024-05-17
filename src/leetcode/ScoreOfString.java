package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ScoreOfString {

    public static int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int adjacentCharacter = i + 1;
            sum += Math.abs((s.charAt(i) - s.charAt(adjacentCharacter)));
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(ScoreOfString.scoreOfString("Hello".toLowerCase()));
    }
}
