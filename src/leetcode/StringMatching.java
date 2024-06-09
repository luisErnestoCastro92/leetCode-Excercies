package leetcode;

import java.util.ArrayList;
import java.util.List;

public class StringMatching {

    public List<String> stringMatching(String[] words) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 1; j < words.length; j++) {
                if (words[i].matches(words[j])) {
                    strings.add(words[i]);
                }
            }
        }
        return strings;
    }

    public static void main(String[] args) {
        StringMatching stringMatching = new StringMatching();
        stringMatching.stringMatching(new String[]{"mass", "as", "hero", "superhero"});
        System.out.println(stringMatching.stringMatching(new String[]{"mass", "as", "hero", "superhero"}));
    }

}
