package tasksDayNo03;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        String nextTrainingDate;

        System.out.println("Please insert date of the very next training\n[in format [yyyy-MM-dd HH:mm:ss]: ");
        Scanner scanner = new Scanner(System.in);
        nextTrainingDate = scanner.nextLine();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime data = LocalDateTime.parse(nextTrainingDate, dateTimeFormatter);

        Duration duration = Duration.between(LocalDateTime.now(),data);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours() );
        System.out.println(duration.toHours()-duration.toDays()*24);
        System.out.println(duration.toMinutes()-duration.toHours()*60);
        System.out.println(duration.toSeconds()-duration.toMinutes()*60);
    }
}
