package tasksDayNo02;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int[] numbersTable = {25,15,36,48,128,36,0,458,1255};

        System.out.println(getMaximumValueFromTable(numbersTable));
        System.out.println(getMinimalValueFromTable(numbersTable));
        System.out.println(getSumFromTable(numbersTable));
        }


    private static int getMinimalValueFromTable(int[] numbersTable){
        int minValue = numbersTable[0];
        for (int i:numbersTable
             ) {
            if(i<minValue){
                 minValue = i;
            }
        }

        return minValue;
    }
    private static int getMaximumValueFromTable(int[] numbersTable) {
        int maxValue = numbersTable[0];
        for (int i : numbersTable
        ) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        return maxValue;
    }

    private static int getSumFromTable(int[] numbersTable){
        int sumOfTable = 0;
        for (int i:numbersTable
             ) {sumOfTable+=i;

        }
        return sumOfTable;
    }
}
