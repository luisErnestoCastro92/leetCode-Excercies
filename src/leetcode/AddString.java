package leetcode;

import java.math.BigInteger;

public class AddString {

    private String addString(String num1, String num2) {
        BigInteger number1 = new BigInteger(num1);
        BigInteger number2 = new BigInteger(num2);
        return number1.add(number2).toString();
    }

    public static void main(String[] args) {
        AddString addString = new AddString();
        System.out.println(addString.addString("6913259244", "71103343"));
    }

}
