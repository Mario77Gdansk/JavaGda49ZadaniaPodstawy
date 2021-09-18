package tasksDayNo03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task06 {
    public static void main(String[] args) {
        String corrctEmailAddress = "aaa@com.pl";
        String incorrctEmailAddress = "aaa";
        System.out.println(isTheTextEmail(corrctEmailAddress));
        System.out.println(isTheTextEmail(incorrctEmailAddress));


    }

    public static boolean isTheTextEmail (String tekst) {
        String regex = "[A-Za-z0-9_.]+@+[a-z]+.+[a-z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(tekst);
        return matcher.matches();
    }
}
