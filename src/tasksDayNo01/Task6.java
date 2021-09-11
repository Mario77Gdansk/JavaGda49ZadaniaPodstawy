package tasksDayNo01;

public class Task6 {
    public static void main(String[] args) {
        int multiplier = 6;
        int minMultiplicand = 2;
        int maxMultiplicand = 5;
        printMultiplicationTable(multiplier, minMultiplicand,maxMultiplicand);

    }


    private static void printMultiplicationTable(int multiplier, int minMultiplicand, int maxMultiplicand){
        while(minMultiplicand<=maxMultiplicand)
           System.out.println(multiplier + " * " + minMultiplicand++ + " = " + multiplier*minMultiplicand);
    }
}
