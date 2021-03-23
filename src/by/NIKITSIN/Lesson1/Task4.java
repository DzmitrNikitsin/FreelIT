package by.NIKITSIN.Lesson1;




//Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int a = in.nextInt();
        System.out.println("Введите число");
        int b = in.nextInt();
        System.out.println("Введите число");
        int c = in.nextInt();


        if (a > 0){
            System.out.println("Положительное число");
        }else if (b > 0) {
            System.out.println("Положительное число");
        }else if (c > 0){
            System.out.println("Положительное число");
        }else {
            System.out.println("Не найденно");
        }

    }
}
