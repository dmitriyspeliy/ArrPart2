import java.util.Arrays;

public class Arr2 {
    public static void main(String[] args) {
        //task1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int num:arr){
            sum+=num;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей\n",sum);
        //task2
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за " +
                "день составила %d рублей\n",min,max);
        //task3
        float average = sum/arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %f рублей\n",average);
        //task4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int k=reverseFullName.length-1;k>=0;k--){
            System.out.print(reverseFullName[k]);
        }


    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
