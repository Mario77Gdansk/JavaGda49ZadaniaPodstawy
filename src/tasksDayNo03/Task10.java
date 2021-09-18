package tasksDayNo03;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        LocalTime start = takeTheStartTime();
        LocalTime stop = takeTheStoptTime();


        int timmer = stop.toSecondOfDay() - start.toSecondOfDay();
        System.out.println("od poczętku dnia minęło "+start.toSecondOfDay()+" sekund");
        System.out.println("od poczętku dnia minęło "+stop.toSecondOfDay()+" sekund");
        System.out.println("stoper pokazał "+timmer+" sekund");
        Duration duration = Duration.between(start,stop);
        System.out.println("stoper w Klasie Duration pokazał "+duration.toSeconds());

    }

    private static LocalTime takeTheStartTime() {
        System.out.print("To start timmnig press ENTER");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println(LocalTime.now());
        return LocalTime.now();
    }
    private static LocalTime takeTheStoptTime() {
        System.out.print("To stop timming press ENTER");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println(LocalTime.now());
        return LocalTime.now();
    }

}
