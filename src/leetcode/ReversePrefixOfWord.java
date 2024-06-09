package leetcode;

public class ReversePrefixOfWord {

    public static String reversePrefix(String word, char ch) {
        StringBuilder subWord;
        if (word.indexOf(ch) != -1) {
            subWord = new StringBuilder(substringUntilChar(word, ch)).reverse();
        } else {
            return word;
        }
        return subWord.append(substring(word, ch)).toString();
    }

    public static String substringUntilChar(String input, char stopChar) {
        int index = input.indexOf(stopChar);
        if (index == -1) {
            // Si el carácter no se encuentra, devuelve la cadena completa
            return input;
        }
        // Devuelve la subcadena desde la posición 0 hasta el índice del carácter (inclusive)
        return input.substring(0, index + 1);
    }

    public static String substring(String input, char stopChar) {
        int index = input.indexOf(stopChar);
        if (index == -1) {
            return input;
        }
        return input.substring(index + 1);
    }

    public static void main(String[] args) {
        System.out.println("substringUntilChar: " + ReversePrefixOfWord.substringUntilChar("xyxzxe", 'z'));
        System.out.println("subString: " + ReversePrefixOfWord.substring("xyxzxe", 'z'));
        System.out.println(reversePrefix("abcd", 'z'));
    }

}
