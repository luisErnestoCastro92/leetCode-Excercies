package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindWordsContainingCharacter {

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                char[] caracteres = words[i].toCharArray();
                if (caracteres[j] == x) {
                    indices.add(i);
                }
            }
        }

        return new ArrayList<>(new HashSet<>(indices));
    }

    public static void main(String[] args) {
        String[] words = {"hola", "mundo"};
        FindWordsContainingCharacter find = new FindWordsContainingCharacter();
        List<Integer> lista = find.findWordsContaining(words, 'u');
        for (Integer nums : lista) {
            System.out.println(nums);
        }
    }

}
