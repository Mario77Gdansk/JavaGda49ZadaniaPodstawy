package tasksDayNo01;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int hiddenNumber = getTheHiddenNumber();
        int licznik = 0;
        int numberFromUser;
 //(i % 3 == 0 ? "Fizz" + (i % 5 == 0 ? "Buzz" : "") : ""+i)
        do {
            numberFromUser=getTheUserNumber();
            licznik++;
            System.out.println(hiddenNumber>numberFromUser ? "not enough" :(hiddenNumber<numberFromUser? "too much" : "Bingo!"));

        } while (hiddenNumber != numberFromUser);
        System.out.println(licznik+"prób do uzyskania sukcesu");
    }

    private static int getTheUserNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę z zakresu 1-100 ...");
        return scanner.nextInt();
    }

    private static int getTheHiddenNumber() {
        System.out.println("Losuję liczbę z zakresu 0 - 100");
        Random random = new Random();
        return random.nextInt(101);
    }

}



