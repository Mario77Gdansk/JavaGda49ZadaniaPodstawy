package tasksDayNo01;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        System.out.println("Podaj liczbę całkowitą, która będzie dzielną ...");
        int dzielna = getTheNumber();

        System.out.println("Podaj liczbę całkowitą, która będzie dzielnikiem ...");
        int dzielnik = getTheNumber();

        int myResult = ownModuloImplementation(dzielna,dzielnik);
        System.out.println("Wynik działania mojej funkcji modulo: "+myResult);

        int moduloResult = dzielna%dzielnik;

        System.out.println("Czy wyniki mojej funkcji i funkcji systemowej są zgodne? ..."
                +(ifOwnModuloImplementationIsCorrect(myResult, moduloResult)?"tak":"nie"));
    }

    private static boolean ifOwnModuloImplementationIsCorrect(int myResult, int moduloResult) {
        return myResult==moduloResult;
    }


    private static int ownModuloImplementation(int dzielna, int dzielnik) {
        return dzielna - (dzielna/dzielnik)*dzielnik;
    }

    private static int getTheNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
