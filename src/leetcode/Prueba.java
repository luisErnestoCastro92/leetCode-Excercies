package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Prueba {
    public static void main(String[] args) {
        String texto = "Este es un ejemplo. Este es el segundo ejemplo. Ejemplo, segundo ejemplo.";

        // Reemplaza signos de puntuación y convierte el texto a minúsculas
        texto = texto.replaceAll("[.,!?:;]+", "").toLowerCase();

        // Divide el texto en palabras
        String[] palabras = texto.split("\\s+");

        // Crea un mapa para almacenar el recuento de palabras
        Map<String, Integer> recuentoPalabras = new HashMap<>();

        // Recorre las palabras y cuenta su frecuencia
        for (String palabra : palabras) {
            if (recuentoPalabras.containsKey(palabra)) {
                int contador = recuentoPalabras.get(palabra);//palabra es la key
                recuentoPalabras.put(palabra, contador + 1);
            } else {
                recuentoPalabras.put(palabra, 1);
            }
        }

        // Muestra el recuento final
        for (Map.Entry<String, Integer> entrada : recuentoPalabras.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
