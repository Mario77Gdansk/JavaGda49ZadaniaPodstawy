package tasksDayNo03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task07 {
    public static void main(String[] args) {
        String correctIban = "PL10101526181245756820252624";
        String incorrectIban = "PL1010156820252624";
        System.out.println(isTheIbanCorrect(correctIban));
        System.out.println(isTheIbanCorrect(incorrectIban));
    }
    public static boolean isTheIbanCorrect (String tekst) {
        String regex = "PL+[0-9]{26}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(tekst);
        return matcher.matches();
    }
}
