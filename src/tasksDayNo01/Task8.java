package tasksDayNo01;

import static java.lang.Math.sqrt;

public class Task8 {
    public static void main(String[] args) {
        int maxRange = 1000000;
        for (int i = 0; i<= maxRange; i++){
            if(isTheNumberPrime(i)){
                System.out.println(i);
            }
        }

    }
    private static boolean isTheNumberPrime(int number){
        if(number<2) {
            return false;
        }
        for(int i=2;i<=sqrt(number);i++){
            if(number%i ==0){
                return false;
            }
        }
      return true;
    }
}

