package leetcode;

public class InvertirCadena {

    public String invertirCadena(String cadena) {
        char[] chars = cadena.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        InvertirCadena invertirCadena = new InvertirCadena();
        System.out.println(invertirCadena.invertirCadena("hola mundo"));
    }
}
