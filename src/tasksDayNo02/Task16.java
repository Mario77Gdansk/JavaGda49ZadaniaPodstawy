package tasksDayNo02;

public class Task16 {
    public static void main(String[] args) {
        int[] input = {12,7,19,25,29,-14,258};
        int[] result = new int[input.length];


        result = arrayInverter(input);

//        System.out.println(result[0]);
//        System.out.println(result[1]);
//        System.out.println(result[2]);
//        System.out.println(result[3]);
//        System.out.println(result[4]);
//        System.out.println(result[5]);
//        System.out.println(result[6]);

        for (int element:result)
        {
            System.out.print(element+" ");
            }

//        for (int i=0; i<result.length; i++) {
//            System.out.print(result[i]+" ");
//        }
    }

    private static int[] arrayInverter(int[] input){
        int[] result = new int[input.length];
//        int trashBin;
        for(int i = 0; i<input.length; i++)
        {
            result[i]=input[(input.length-1)-i];
        }
        return result;
    }
}
