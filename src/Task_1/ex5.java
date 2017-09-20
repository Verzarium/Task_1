package Task_1;

import java.util.Scanner;

//5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.
public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int size = in.nextInt();
        int a[] = new int[size];
        System.out.println();
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            a[i] = in.nextInt();
        }
        System.out.print(a[0]);
        for (int j = 1; j < size; j++) System.out.print(" + " + a[j]);
        System.out.print(" = ");
        int sum = 0;
        for (int y = 0; y < size; y++) {
            sum += a[y];
        }
        System.out.print(sum);
    }
}
