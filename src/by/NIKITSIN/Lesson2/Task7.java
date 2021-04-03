package by.NIKITSIN.Lesson2;

public class Task7 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        for (i = 1; i <=99; i++){
            if (i % 2 !=0) {
                sum +=i;
                System.out.println("Сумма нечетных чисел " + sum);
            }
        }
    }

}
