package Task_1;
//4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        System.out.print("Введите пароль: ");
        Scanner in = new Scanner(System.in);
        String pass = in.nextLine();
        String passtrue = "qwert";
        if(pass.equals(passtrue)) {
            System.out.println("Вы ввели правильный пароль");
        }
        else {
            System.out.println("Вы ввели не пральный пароль");
        }
    }
}
