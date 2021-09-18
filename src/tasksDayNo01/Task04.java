package tasksDayNo01;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

    int weight = takeTheWeightFromUser();
    int height = takeTheHeightFromUser();
    float bmi = calculateTheBMI(weight,height);

    String bmiDescription = (bmi>=18.5&&bmi<=24.9) ? "BMI is correct: " + bmi : "BMI is not correct: " + bmi;
        System.out.println(bmiDescription);
    }
    private static float calculateTheBMI(float weight, int height){
        return (weight/(height*height))*10000;
    }
    private static int takeTheWeightFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, insert the weight in kg: ");
        return scanner.nextInt();
    }
    private static int takeTheHeightFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, insert the height in cm: ");
        return scanner.nextInt();
    }
}
