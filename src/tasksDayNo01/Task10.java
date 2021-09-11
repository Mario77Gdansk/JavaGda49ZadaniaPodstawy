package tasksDayNo01;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();

        System.out.println(sumOfDigits(number));

    }

    private static int sumOfDigits(int number) {
        if (number <= 9) {
            return number;
        }
        int sumOfDigits = 0;
        do {
            sumOfDigits += number % 10;
            number /= 10;
        }
        while (number != 0);

        return sumOfDigits;
    }
}
