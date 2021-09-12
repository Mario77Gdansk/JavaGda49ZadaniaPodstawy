package tasksDayNo02;

public class Task15 {
    public static void main(String[] args) {
        String[] firstArray = {"Ala", "ma", "kota"};
        String[] secondArray = {"Ala", "ma", "kotaa"};

        if (firstArray.length != secondArray.length) {
            System.out.println("Tablice są różnej wielkości");
        }
        System.out.println(compareTwoArrays(firstArray,secondArray));

    }

    private static boolean compareTwoArrays(String[] firstArray, String[] secondArray) {
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) return false;
            }
        return true;
    }


}
