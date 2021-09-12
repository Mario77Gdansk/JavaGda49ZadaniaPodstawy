package tasksDayNo02;

import java.util.Objects;

public class Task1 {
    public static void main(String[] args) {

        String text = null;




        System.out.println(giveMeFirstSign(text));
        System.out.println(giveMeLastSign(text));
    }

    private static char giveMeFirstSign(String text) {
        if (text == null || text.isBlank()) {
            System.out.println("tekst jest niedozwolony");
            System.exit(-1);
        }
        text = text.trim();
        return text.charAt(0);
    }

    private static char giveMeLastSign(String text) {
        if (text == null || text.isBlank()) {
            System.out.println("tekst jest niedozwolony");
            System.exit(-1);
        }
        text = text.trim();
        return text.charAt(text.length() - 1);
        }
}

