package tasksDayNo02;

public class Task6 {
    public static void main(String[] args) {

        System.out.println(getTheSignIndex("Ala ma kota", 'a'));
        System.out.println(getTheSignIndex("Ala ma kota", 'z'));
    }


    private static int getTheSignIndex(String input, char letter) {

        if (input != null && !input.isBlank()) {
            for (int i = 0; i< input.length();i++) {
                if (input.charAt(i)==letter) {
                   return i;
                }

            }

        }
        return -1;
    }
}
