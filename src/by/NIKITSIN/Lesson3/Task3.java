package by.NIKITSIN.Lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        for (int i = 0; i <array.length; i++){
            array[i] = random.nextInt(1 - -99);

        }
        System.out.println(Arrays.toString(array));

    }
}
