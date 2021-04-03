package by.NIKITSIN.Lesson2;

public class Task3 {
    public static void main(String[] args) {
        int summa = 14;
        int i = 2;

        while (i <= 256) {
            summa += i;
            i *=2;
            System.out.println(summa);
        }
    }
}
