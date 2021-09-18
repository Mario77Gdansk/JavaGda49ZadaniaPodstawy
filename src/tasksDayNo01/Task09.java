package tasksDayNo01;
// Napisz program, którydla danej liczby x wygeneruje wszystkie liczby od 1 do x. Jeżeliliczba jest
//podzielna przez 3 wyświetli słowo "Fizz", gdy podzielna przez 5 wyświetli słowo "Buzz", jeżeli
//podzielna zarównoprzez 3 i 5 to wyświetlisłowo"FizzBuzz".
//Przykład:
//Range from 0 to 10
//1
//2
//Fizz
//4

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        int checkRange = getCheckRange();
        for (int i = 1; i < checkRange; i++) {
            System.out.println(i % 3 == 0 ? "Fizz" + (i % 5 == 0 ? "Buzz" : "") : ""+i);
        }

    }

    private static int getCheckRange() {
        System.out.println("Podaj górny zakres do sprawdzenia podzielności przez 3 i przez 5: ...");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
