public class ArraysExercise1 {
    public static void printEvenNumbersNoDuplication (int[] array){
        int evenCounter = 0;
        int duplications = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                evenCounter++;
            }
        }
        int[] evenOnly = new int[evenCounter];
        int oddCounter = 0;
        String dp = ",";
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                if (!dp.contains("," + array[i] + ",")){
                    evenOnly[i - oddCounter] = array[i];
                    dp += array[i] + ",";
                }else{
                    oddCounter++;
                }
            }else{
                oddCounter++;
            }
        }
        for (int i = 0; i < evenOnly.length; i++){
            System.out.println(evenOnly[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {7, 2, 2, 4, 9, 6, 4, 3, 8, 8};
        printEvenNumbersNoDuplication(array);
    }
}
