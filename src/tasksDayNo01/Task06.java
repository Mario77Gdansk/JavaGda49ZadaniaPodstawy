package tasksDayNo01;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj piewrszy, stały czynnik tabliczki mnożenia: ");
        int multiplier = scanner.nextInt();
        System.out.println("Podaj drugi czynnik tabliczki mnożenia, wartość dolna: ");
        int minMultiplicand = scanner.nextInt();
        System.out.println("Podaj drugi czynnik tabliczki mnożenia, wartość górna: ");
        int maxMultiplicand = scanner.nextInt();
        printMultiplicationTable(multiplier, minMultiplicand, maxMultiplicand);
    }


    private static void printMultiplicationTable(int multiplier, int minMultiplicand, int maxMultiplicand) {
        while (minMultiplicand <= maxMultiplicand) {
            System.out.println(multiplier + " * " + minMultiplicand + " = " + multiplier * minMultiplicand);
            minMultiplicand++;
        }

    }
}
