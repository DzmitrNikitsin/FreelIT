package by.NIKITSIN.Lesson2;

public class Task1 {
    public static void main(String[] args) {
        int kilometers = 10;

        for (int i =1; i < 7; i++){
            kilometers *= 1.1;
            System.out.println("Пробежал за 7 дней " + kilometers);
        }
    }
}
