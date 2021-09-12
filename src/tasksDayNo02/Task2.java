package tasksDayNo02;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(checkThePrefix("programowanie","pro"));
        System.out.println(checkTheSufix("politechnika","technika"));

    }

    private static boolean checkThePrefix(String input, String prefix){
    return input.startsWith(prefix);
    }
    private static boolean checkTheSufix(String input, String sufix){
        return input.endsWith(sufix);
    }
}
