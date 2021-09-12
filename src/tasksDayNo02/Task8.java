package tasksDayNo02;
//65-90 A-Z
//97-122 a-z


public class Task8 {
    private static final int VALUE_UPPER_A = 65;
    private static final int VALUE_UPPER_Z = 90;
    private static final int VALUE_lower_a = 97;
    private static final int VALUE_lower_z = 122;
    private static final int LETTERS_SPREAD = 32;

    public static void main(String[] args) {

        System.out.println(changeTheLettersSize("AlaKot"));

    }


    private static String changeTheLettersSize(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar >= VALUE_UPPER_A && currentChar <= VALUE_UPPER_Z) {
                result.append((char) (currentChar + LETTERS_SPREAD));
            } else if (currentChar >= VALUE_lower_a && currentChar <= VALUE_lower_z) {
                result.append((char) (currentChar - LETTERS_SPREAD));
            } else {
                result.append(currentChar);
            }

        }
        return result.toString();
    }

}
