package tasksDayNo02;

public class Task5forEach {
    public static void main(String[] args) {

        System.out.println(countTheCharInTheTextforEach("Ala ma kota", 'a'));
    }


    private static int countTheCharInTheTextforEach(String input, char letter) {
        int counter = 0;
        char[] letters = input.toCharArray();

        if (input != null && !input.isBlank()) {
            for (char c : letters) {
                if (c == letter) {
                    counter++;
                }

            }

        }
        return counter;
    }
}
