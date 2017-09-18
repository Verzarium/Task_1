package Task_1;
//3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        System.out.print("Введите количество случайных чисел: ");
        Scanner in = new Scanner(System.in);
        int s = Integer.parseInt(in.nextLine());
        for (int i = 0; i < s; i++) {
            System.out.println(Math.random());
        }
        for (int j = 0; j < s; j++) {
            System.out.print(Math.random());
        }
    }
}
