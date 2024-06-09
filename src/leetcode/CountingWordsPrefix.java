package leetcode;

public class CountingWordsPrefix {

    public int prefixCount(String[] words, String pref) {//solucion optimizada
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(pref)) {
                count++;
            }
        }
        return count;
    }

    /*public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (pref.length() <= words[i].length() && words[i].startsWith(pref)) {
                count++;
            }
        }
        return count;
    }*/

    /*public int prefixCount(String[] words, String pref) { primera solucion
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (pref.length() <= words[i].length()) {
                String prefix = words[i].substring(0, pref.length());
                if (prefix.equals(pref)) {
                    count++;
                }
            }
        }
        return count;
    }*/


    /*public int prefixCount(String[] words, String pref) {segunda solucion
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (pref.length() <= words[i].length()) {
                if (words[i].startsWith(pref)) {
                    count++;
                }
            }
        }
        return count;
    }*/

    public static void main(String[] args) {
        System.out.println(new CountingWordsPrefix().prefixCount(new String[]{"leetcode", "win", "loops", "success"}, "code"));
    }

}
