package tasksDayNo01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
 //       displayWordUsingDecimals();

        float radiusFromUser = getradiusFromUser();
        calculateCircumferenceFromUser(radiusFromUser);
        calculateCurcumference();

    }

    private static double calculateCircumferenceFromUser(float diameterFromUser) {
        final double PI = 3.14F;
        return 2*PI*diameterFromUser;
    }

    private static void displayWordUsingDecimals(){
        char S = 0b01010011; //83
        char D = 68; //68
        char A = 0x41; //65
        System.out.print(S);
        System.out.print(D);
        System.out.print(D);
    }
    private static float getradiusFromUser() {
        final double PI = 3.14;
        float radius = 0;
        try {
            System.out.println("Podaj promień, a ja obliczę pole koła lub jego obwód");
            System.out.println("Promień: ");
            Scanner scan = new Scanner(System.in);
            float radiusFromScanner = scan.nextFloat();
        } catch (InputMismatchException exception) {
            System.out.println("Please use only digits");
        }

        return radius;
    }

    private static void calculateCurcumference(){
        final double PI = 3.14;
        System.out.println("Podaj promień, a ja wyświetlę obwód koła");
        System.out.println("Promień: ");
        Scanner scan = new Scanner(System.in);
        float radius = scan.nextFloat();
        System.out.printf("Pole wynosi %.2f \n", 2*PI*radius);
    }
}
