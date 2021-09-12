package tasksDayNo02;

public class Task14 {
    public static void main(String[] args) {
    int[] numbersTable = {25,-15,36,-48,128,-36,0,-458,1255};

//    if (countNegativeValueFromTable(numbersTable)>0) {fillNegativeValueTable()}

    }

    private static int countNegativeValueFromTable(int[] numbersTable){
        int negativesCounter = 0;
        for (int i:numbersTable)
            {if (i<0)
            {negativesCounter++;
            }
        }
    return negativesCounter;
    }

//    private static int[] createArrayWithNegativeValues(int[] inputs, )

 }
