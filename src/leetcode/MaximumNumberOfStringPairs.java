package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfStringPairs {

    public int maximumNumberOfStringPairs(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        StringBuilder stringBuilder;
        for (int i = 0; i < words.length; i++) {
            stringBuilder = new StringBuilder(words[i]).reverse();//"cd", "ac", "dc", "ca", "zz"
            if (!map.containsKey(stringBuilder.toString())) {
                map.put(words[i], i);
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print(new MaximumNumberOfStringPairs().maximumNumberOfStringPairs(new String[]{"cd", "ac", "dc", "ca", "zz"}));
    }

}
