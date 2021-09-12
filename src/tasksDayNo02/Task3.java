package tasksDayNo02;

public class Task3 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        String word = "ma";


        System.out.println(getIndex(input,word));
    }

    private static int getIndex(String input, String word){
        return (input!=null && input.contains(word)) ? input.indexOf(word) : -1;
    }



}
