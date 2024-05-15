package leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {

    public WordCount() {
    }

    public void wordCount(String text) {
        // Define una expresión regular para encontrar signos de puntuación
        String regex = "[.,!?;:]+|\\s+";
        // Crea un objeto Pattern con la expresión regular
        Pattern pattern = Pattern.compile(regex);
        // Crea un objeto Matcher para buscar los signos de puntuación en el texto
        Matcher matcher = pattern.matcher(text);
        // Usa el método replaceAll para quitar los signos de puntuación
        String textoSinPuntuacion = matcher.replaceAll(" ").trim().toLowerCase();
        String[] words = textoSinPuntuacion.split(" ");
        int count = 1;
        for (int i = 0; i < words.length; i++) {
            for (int j = words.length - 1; j >= 0; j--) {
                if (words[i].equals(words[j])) {
                    System.out.println(words[i]);
                }
                if (j == 0) break;
            }
        }
    }

    public static void main(String[] args) {
        WordCount words = new WordCount();
        words.wordCount("este texto es una prueba para comprobar una situacion de prueba comprobar este");
    }
}
