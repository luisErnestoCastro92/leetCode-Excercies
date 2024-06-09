package leetcode;

import java.util.*;

public class RemovingAnagrams {

    public List<String> removeAnagrams(String[] words) {
        Set<String> anagrams = new HashSet<>();
        int count = 0;
        int sum1 = 0, sum2 = 0;
        for (int i = 1; i < words.length; i++) {
            String anagramToCompare = words[count];
            sum1 += anagramToCompare.charAt(i);
            for (int j = 0; j < words[i].length(); j++) {
                sum2 += words[i].charAt(j);
                if (sum1 == sum2) {
                    anagrams.add(anagramToCompare);
                }
            }
            count++;
        }

        return new ArrayList<>(anagrams);
    }

    public static void main(String[] args) {
        String[] words = {"abba", "baba", "bbaa", "cd", "cd"};
        RemovingAnagrams removingAnagrams = new RemovingAnagrams();
        System.out.println(removingAnagrams.removeAnagrams(words));
    }

}
