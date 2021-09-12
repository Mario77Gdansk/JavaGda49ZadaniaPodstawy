package tasksDayNo02;

public class Taks5 {
    public static void main(String[] args) {

        System.out.println(countTheCharInTheText("Ala ma kota",'a'));

    }
    private static int countTheCharInTheText(String input, char letter){
            int counter = 0;
        if(input!=null&&!input.isBlank()){
            for (int i = 0; i<input.length(); i++){
                 if(input.charAt(i )== letter){
                     counter++;
                 }
            }
        }
        return counter;
    }
}
