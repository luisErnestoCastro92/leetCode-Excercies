package leetcode;

import java.util.HashMap;
import java.util.Map;

public class CountAsterisks {

    public int countAsterisks(String s) {//"yo|uar|e**|b|e***au|tifu|l" 5 asteriscos
        int countAsterisks = 0;
        int countAsterisksGlobal = 0;
        String[] words = s.split("\\|");
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == '*') {
                    countAsterisks++;
                } else {
                    break;
                }
            }
        }
        return countAsterisks;
    }

    public static void main(String[] args) {
        CountAsterisks countAsterisks = new CountAsterisks();
        String words = "l|*e*et|c***o|*de|";
        System.out.println(countAsterisks.countAsterisks(words));
    }

}
