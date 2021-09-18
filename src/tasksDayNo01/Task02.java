package tasksDayNo01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        float radius = getradiusFromUser();
        System.out.println("Obwód koła wynosi: " + calculateCircumferenceFromUser(radius));
        System.out.println("Pole koła wynosi: " + calculateCircleSurfaceFromUser(radius));

        System.out.printf("Obwód wynosi %.2f \n", calculateCurcumferenceWithRightNumericFormat(radius));
        System.out.printf("Pole koła %.2f ", calculateCirleSurfaceWithRightNumericFormat(radius));

    }

    private static float getradiusFromUser() {
        float radiusFromScanner = 0;
        try {
            System.out.println("Podaj promień, a ja obliczę pole koła i jego obwód");
            System.out.println("Promień: ");
            Scanner scan = new Scanner(System.in);
            radiusFromScanner = scan.nextFloat();
        } catch (InputMismatchException exception) {
            System.out.println("Please use only digits");
        }
        return radiusFromScanner;
    }

    private static double calculateCircumferenceFromUser(float radiusFromUser) {
        final double PI = 3.14F;
        return 2 * PI * radiusFromUser;
    }

    private static double calculateCircleSurfaceFromUser(float radiusFromUser) {
        final double PI = 3.14F;
        return PI * radiusFromUser * radiusFromUser;
    }

    private static double calculateCurcumferenceWithRightNumericFormat(float radiusFromUser) {
        return 2 * Math.PI * radiusFromUser;
    }

    private static double calculateCirleSurfaceWithRightNumericFormat(float radiusFromUser) {
        return Math.PI * radiusFromUser*radiusFromUser;
    }
}
