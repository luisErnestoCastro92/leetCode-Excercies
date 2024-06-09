package leetcode;

public class FindFirstPalindromic {

    public String firstPalindrome(String[] words) {
        StringBuilder[] word = new StringBuilder[words.length];
        for (int i = 0; i < words.length; i++) {
            word[i] = new StringBuilder().append(words[i]);
            if (words[i].equals(word[i].reverse().toString())) {
                return word[i].toString();
            }
        }
        return "";
    }

    public static void main(String[] args) {
        FindFirstPalindromic ffp = new FindFirstPalindromic();
        String[] words = {"abc", "car", "ada", "racecar", "cool"};
        System.out.println(ffp.firstPalindrome(words));
    }

}
