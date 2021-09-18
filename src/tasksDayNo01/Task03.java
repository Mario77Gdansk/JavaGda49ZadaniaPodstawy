package tasksDayNo01;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Please insert second number: ");
        int secondNumber = scanner.nextInt();

        boolean resultPointA = firstNumber > secondNumber;
        System.out.println("A: " + firstNumber + " > " + secondNumber + " ---> " + resultPointA);

        boolean resultPointB = 3 * firstNumber > secondNumber;
        System.out.println("B: " + "3 * " + firstNumber + " > " + secondNumber + " ---> "  + resultPointB);

        boolean resultPointC = (secondNumber++ < ++firstNumber) && (--firstNumber < secondNumber++);
        System.out.println("C: " + resultPointC);

        boolean resultPointD = ((firstNumber * secondNumber) % 2 == 0);
        System.out.println("D: " + resultPointD);

    }
}
