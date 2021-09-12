package tasksDayNo02;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        int [] arrayOfIntegers = new int[10];
        int [] sortedArrayOfIntegers = new int[10];

        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<10;i++){
            System.out.println("Podaj "+(i+1)+" liczbę");
            arrayOfIntegers[i] = scanner.nextInt();
        }
        ;
        for (int element:sortTheTable(arrayOfIntegers))
        {
            System.out.print(element+" ");
        }
    }

         private static int[] sortTheTable(int[]arrayOfIntegers) {
             int[] newArrayOfIntegers = new int[10];
             int trashBin = 0;
             for (int j = 0; j < 10; j++) {
                 for (int i = 0; i < 9; i++) {
                     if (arrayOfIntegers[i] > arrayOfIntegers[i + 1]) {
                         trashBin = arrayOfIntegers[i + 1];
                         arrayOfIntegers[i + 1] = arrayOfIntegers[i];
                         arrayOfIntegers[i] = trashBin;
                     }
                 }
             }

             return arrayOfIntegers;
         }
         }


