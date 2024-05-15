package leetcode;

public class RemoveVowels {

    public String removeVowels(String frase) {

        char[] caracteres = frase.toCharArray();
        StringBuilder fraseSinVocales = new StringBuilder();
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == 97 || caracteres[i] == 101  || caracteres[i] == 105 || caracteres[i] == 111 || caracteres[i] == 117) {
                caracteres[i] = 'x';
            }
            fraseSinVocales.append(caracteres[i]);
        }
        return fraseSinVocales.toString();
    }

    public static void main(String[] args) {
        RemoveVowels removeVowels = new RemoveVowels();
        System.out.println(removeVowels.removeVowels("murcielago"));
    }

}
