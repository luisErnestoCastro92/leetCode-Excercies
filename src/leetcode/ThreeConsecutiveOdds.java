package leetcode;

public class ThreeConsecutiveOdds {

    public boolean threeConsecutiveOdds(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                index = i;
            }

            /*if (index + 1 > arr.length - 1) {
                return false;
            }*/

            if (arr[index + 1] % 2 != 0) {
                index = index + 1;
            }

            if (arr[index + 1] % 2 != 0) {
                return true;
            }

        }
        return false;
    }

    public boolean threeConsecutiveOdds2(int[] arr) {
        int contador = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                contador++;
            } else {
                contador = 0;
            }

            if (contador == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ThreeConsecutiveOdds tco = new ThreeConsecutiveOdds();
        /*int[] a = {2, 6, 4, 1};
        int[] b = {1, 2, 34, 3, 5, 7, 23, 12};
        int[] c = {1, 3, 5};*/
        int[] d = {1, 2, 1, 1};
        System.out.print(tco.threeConsecutiveOdds2(d));
    }
}
