package tasksDayNo01;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Please insert first number: ");
        int secondNumber = scanner.nextInt();

        boolean resultPointA = firstNumber>secondNumber;
        System.out.println("A: "+resultPointA);
        boolean resultPointB = 3*firstNumber>secondNumber;
        System.out.println("B: "+resultPointB);
        boolean resultPointD = ((firstNumber*secondNumber)%2==0);
        System.out.println("D: "+resultPointD);
        boolean resultPointC = (secondNumber++<++firstNumber)&&(--firstNumber<secondNumber++);
        System.out.println("C: "+resultPointC);

    }
}
