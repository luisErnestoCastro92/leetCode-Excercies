package leetcode;

public class EsPalindromo {

    public boolean esPalindromo(String frase) {
        boolean esPalindromo = false;
        String textoLimpio = frase.replaceAll("[.,!?;:]+|\\s+", "").toLowerCase();
        System.out.println("texto limpio: " + textoLimpio);
        StringBuilder fraseVolteada = new StringBuilder();
        for (int i = textoLimpio.length() - 1; i >= 0; i--) {
            fraseVolteada.append(textoLimpio.charAt(i));
        }
        System.out.println("frase volteada: " + fraseVolteada);
        if (textoLimpio.equals(fraseVolteada.toString())) {
            esPalindromo = true;
        }
        return esPalindromo;
    }

    public static void main(String[] args) {
        EsPalindromo espalindromo = new EsPalindromo();
        System.out.println(espalindromo.esPalindromo("Ana lleva al oso la avellana."));
    }
}
