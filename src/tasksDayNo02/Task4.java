package tasksDayNo02;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your text: ");
        String text = scanner.nextLine();

        System.out.println(replaceDotsAndCommas(text));
    }
    private static String replaceDotsAndCommas(String text){
        return text.replace(",","-STOP-").replace(".","-STOP-");
    }


}
