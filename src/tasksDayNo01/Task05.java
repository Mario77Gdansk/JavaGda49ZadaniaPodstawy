package tasksDayNo01;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Podaj dolną liczbę zakresu sumowania: ");
        Scanner scannerLower = new Scanner(System.in);
        int lowerLimit = scannerLower.nextInt();
        System.out.println("Podaj górną liczbę zakresu sumowania: ");
        Scanner scannerUpper = new Scanner(System.in);
        int upperLimit = scannerUpper.nextInt();

        System.out.println("FOR: "+sumOfNumbersFromAToBWithFOR(lowerLimit, upperLimit));
        System.out.println("WHILE: "+sumOfNumbersFromAToBWithWHILE(lowerLimit, upperLimit));
        System.out.println("DO WHILE: "+sumOfNumbersFromAToBWithDoWHILE(lowerLimit,upperLimit));

    }

    private static int sumOfNumbersFromAToBWithFOR(int lowerLimit, int upperLimit) {
        int sum = 0;


        for (int i = lowerLimit; i <= upperLimit; i++) {
            sum = sum + i;
        }
        return sum;
    }

    private static int sumOfNumbersFromAToBWithWHILE(int lowerLimit, int upperLimit) {
        int sum = 0;


        while (lowerLimit <= upperLimit) {
            sum += lowerLimit++;

        }
        return sum;
    }

    private static int sumOfNumbersFromAToBWithDoWHILE(int lowerLimit, int upperLimit) {
        int sum = 0;
        do {
            sum += lowerLimit++;
        }
        while (lowerLimit <= upperLimit);
        return sum;
    }

}
