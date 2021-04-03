package by.NIKITSIN.Lesson1;

import java.util.Scanner;


/*
Дано целое число. Если оно является положительным, то прибавить к нему 1.Если
отрицательным, то вычесть из него 2. Если нулевым, то заменить его на 10. Вывести полученное
число
*/

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int number = in.nextInt();

        if (number >= 1){
            number++;
            System.out.println("Число " + number);
        }else if (number < 0 ){
            number -= 2;
            System.out.println("Число " + number);
        }else if (number == 0){
            number = 10;
            System.out.println("число " + number);
        }
    }
}
