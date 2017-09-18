package Task_1;

import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        System.out.print("Введите ваше имя: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("Привет, " + s);
    }
}
