package dataStructure;

import java.util.Scanner;

public class RandomNumber {

    public String randomNumber() {
        int randomNumber = (int) (Math.random() * 1000);
        System.out.println("el numero aleatorio es: " + randomNumber);
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        do {
            System.out.println(" ingresa un numero: ");
            numero = sc.nextInt();
            if (numero < randomNumber) {
                System.out.println("el numero ingresado es muy chico");
            } else if (numero > randomNumber) {
                System.out.println("el numero ingresado es muy grande");
            }
        } while (numero != randomNumber);
        System.out.println("felicidades has adivinado el numero ");

        return String.valueOf(randomNumber);
    }

    public static void main(String[] args) {
        RandomNumber num = new RandomNumber();
        System.out.println(num.randomNumber());

    }

}
