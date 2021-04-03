package by.NIKITSIN.Lesson1;


import java.util.Scanner;


//Даны 2 числа. Вывести большее из них

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите одно число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();

        if (a > b){
            System.out.println("Это число больше" + a);
        }else if (a < b){
            System.out.println("Это число больше " + b);
        }

    }
}
