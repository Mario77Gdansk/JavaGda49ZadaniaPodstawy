package tasksDayNo01;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String decision;
        do {
            System.out.println("Please insert first digit: ");
            float firstDigit = scanner.nextFloat();
            System.out.println("Please insert second digit: ");
            float secondDigit = scanner.nextFloat();
            System.out.println("Please insert operator: ");
            scanner.nextLine();
            String operator = scanner.nextLine();

            float result = calculate(firstDigit, secondDigit, operator);
            System.out.println("Result: \n" + result);


            System.out.println("New calculation or STOP");
            scanner.nextLine();
            decision = scanner.nextLine();

            } while ("STOP".equalsIgnoreCase(decision));
    }

    private static float calculate(float firstDigit, float secondDigit, String operator) {
        float result = 0;
        switch (operator) {
            case "+":
                return firstDigit + secondDigit;
            case "-":
                return firstDigit - secondDigit;
            case "*":
                return firstDigit * secondDigit;
            case "/":
                if (secondDigit==0){
                    System.out.println("ERROR");
                    System.exit(1);
                }
                return firstDigit / secondDigit;
            case "^":
                return (float)Math.pow(firstDigit,secondDigit);
            case "sqrt":
                return (float)Math.pow(firstDigit,(1/secondDigit));
            default:
                System.out.println("operator not exist");
                System.exit(1);
        }
        return result;
    }
}