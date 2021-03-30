package by.NIKITSIN.Lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array1 = new int[5];
        double sum1 = 0;
        double sum2 = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(0 - -15);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array1.length; i++){
            array1[i] = random.nextInt(0 - - 15);
        }
        System.out.println(Arrays.toString(array1));

        for(double c : array){
            sum1 +=c;
        }
        System.out.println(sum1 / array.length);

        for (double c : array1){
            sum2 += c;
        }
        System.out.println(sum2 / array1.length);

    }
}
