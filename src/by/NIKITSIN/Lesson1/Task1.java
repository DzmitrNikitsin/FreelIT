package by.NIKITSIN.Lesson1;

import java.util.Scanner;

/*
В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и
положительное оно или отрицательное. Например, &quot;это однозначное положительное число&quot;.
Достаточно будет определить, является ли число однозначным, двузначным или трехзначным и
более.
*/

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int number = in.nextInt();
        String str = Integer.toString(number);

        // перевести int в string

        if(number >= 1){
            System.out.println("Число положительное и в нем " + str.length() + " Цифр");
        }else if (number < 0) {
            System.out.println("Число отрицательное и в нем" + str.length() + "Цифр");
        }else {
            System.out.println("Число равно нулю");
        }
    }
}
