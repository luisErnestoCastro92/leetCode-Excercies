package leetcode;

public class Panagram {

    public boolean checkIfPangram(String sentence) {
        int sumAlphabet = getSumCharacterOfAlphabet();
        int sumSentence = 0;
        for (int i = 0; i < sentence.length(); i++) {
            sumSentence += sentence.charAt(i);
        }
        System.out.println("sumSentence: " + sumSentence);
        return sumSentence >= sumAlphabet;
    }

    public int getSumCharacterOfAlphabet() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int sum = 0;
        for (int i = 0; i < alphabet.length(); i++) {
            sum += alphabet.charAt(i);
        }
        System.out.println("sum alphabet: " + sum);
        return sum;
    }

    public static void main(String[] args) {
        String sentence = "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
        System.out.println(new Panagram().checkIfPangram(sentence));
    }

}
