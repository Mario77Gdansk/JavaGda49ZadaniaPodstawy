package tasksDayNo03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task08 {
    public static void main(String[] args) {
        String floatNumber = "1234,12345";
        String incorrectFloatNumber = "1234d45";
        System.out.println(isTheFloatNumberCorrect(floatNumber));
        System.out.println(isTheFloatNumberCorrect(incorrectFloatNumber));
    }

    private static boolean isTheFloatNumberCorrect(String floatNumber) {
        String regex = "-?+\\d+(,\\d+)?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(floatNumber);
        return matcher.matches();
    }

}
