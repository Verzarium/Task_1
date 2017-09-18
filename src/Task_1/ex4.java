package Task_1;
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        System.out.print("Введите пароль: ");
        Scanner in = new Scanner(System.in);
        String pass = in.nextLine();
        String passtrue = "qwert";
        if(pass == passtrue) {
            System.out.println("Вы ввели правильный пароль");
        }
        else {
            System.out.println("Вы ввели не пральный пароль");
        }
    }
}
