package by.NIKITSIN.Lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i<array.length; i++){
            array[i] = random.nextInt(0- -20);
            System.out.println(Arrays.toString(array));
            if ((array[i] % 2) != 0){
                array[i] = 0;
                System.out.println(Arrays.toString(array));
            }
        }
    }
}
