package tasksDayNo02;

public class Task11 {
    public static void main(String[] args) {

        System.out.println(textIsPalindrome("kajak"));

    }

     private static boolean textIsPalindrome(String input){
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append(input).reverse().toString().equals(input);
     }
}
