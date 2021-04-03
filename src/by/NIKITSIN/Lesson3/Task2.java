package by.NIKITSIN.Lesson3;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int i;
        int index = 0;
        int[] myArray = new int[50];
        for ( i = 1; i <= 99; i++){
            if (i%2!=0){
                myArray[index] = i;
                index++;

            }
        }
        String message = "";
        for (i = 0; i<myArray.length; i++){
            message += myArray[i] + " ";

        }

        System.out.println(message);
        message = "";
        for ( i = myArray.length -1; i >=0; i--){
            message += myArray[i] + " ";
        }
        System.out.println(message);


    }

}
