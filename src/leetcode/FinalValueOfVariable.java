package leetcode;

public class FinalValueOfVariable {

    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("--X")) {
                --x;
            } else if (operations[i].equals("X--")) {
                x--;
            } else if (operations[i].equals("++X")) {
                ++x;
            } else {
                x++;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        FinalValueOfVariable valueOfVariable = new FinalValueOfVariable();
        String[] operations = {"++X", "++X", "X++"};
        System.out.println(valueOfVariable.finalValueAfterOperations(operations));
    }
}
