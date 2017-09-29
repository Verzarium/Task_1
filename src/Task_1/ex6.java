package Task_1;

/*6.Ввести с консоли n целых чисел. На консоль вывести:
6.1. Четные и нечетные числа.
6.2. Наибольшее и наименьшее число.
6.3. Числа, которые делятся на 3 или на 9.
6.4. Числа, которые делятся на 5 и на 7.
6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
6.6. «Счастливые» числа.
6.7. Элементы, которые равны полусумме соседних элементов.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scan scan = new Scan().invoke();
        int size = scan.getSize();
        int[] a = scan.getA();
//6.1. Четные и нечетные числа.
        //EvenOdd(a);
//6.2. Наибольшее и наименьшее число.
        //MaxMin(a);
//6.3. Числа, которые делятся на 3 или на 9.
        //Divided3or9(a);
//6.4. Числа, которые делятся на 5 и на 7.
        //Divided5and7(a);
//6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
        //DiffDigits();
//6.6. «Счастливые» числа.
        //HappyNumbers();
//6.7. Элементы, которые равны полусумме соседних элементов.
        NumbersHalfSum(a);
    }
//6.1. Четные и нечетные числа.
    private static void EvenOdd(int[] a) {

        System.out.print("Нечетные элементы:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 - 1 == 0) {
                System.out.print(" " + a[i]);
            }
        }
        System.out.println();
        System.out.print("Четный элемент:");
        for (int x = 0; x < a.length; x++) {
            if (a[x] % 2 == 0) {
                System.out.print(" " + a[x]);
            }
        }
    }

    private static void MaxMin(int[] a) {
        System.out.println();
        int max = a[0], min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];

            else if (a[i] < min)
                min = a[i];
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
    }

    private static void Divided3or9(int[] a) {
        System.out.print("Числа, которые делятся на 3 или на 9: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0 || a[i] % 9 == 0)
                System.out.print(a[i] + " ");
        }
    }

    private static void Divided5and7(int[] a) {
        System.out.println();
        System.out.print("Числа, которые делятся на 5 и на 7: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 == 0 && a[i] % 7 == 0)
                System.out.print(a[i] + " ");
        }
    }

    private static void DiffDigits() {
        System.out.print("Все трехзначные числа, в десятичной записи которых нет одинаковых цифр: ");
        for (int i = 100; i < 1000; i++) {
            String num = Integer.toString(i);
            if (num.charAt(0) != num.charAt(1) && num.charAt(0) != num.charAt(2) && num.charAt(1) != num.charAt(2)) {
                System.out.print(" " + i);
            }
        }
    }

    private static void HappyNumbers() {
        System.out.print("“Счастливые” числа: ");
        for (int i = 1000; i < 10000; i++) {
            String num = Integer.toString(i);
            if (num.length() == 4 && num.charAt(0) + num.charAt(1) == num.charAt(2) + num.charAt(3)) {
                System.out.print(" " + i);
            }
        }
    }

    private static void NumbersHalfSum(int[] a) {
        System.out.print("Элементы, которые равны полусумме соседних элементов: ");
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] == ( a[i-1] + a[i+1] ) / 2) {
                System.out.print(" " + a[i]);
            }
        }
    }

    private static class Scan {
        private int size;
        private int[] a;

        public int getSize() {
            return size;
        }

        public int[] getA() {
            return a;
        }

        public Scan invoke() {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите длину массива: ");
            size = in.nextInt();
            a = new int[size];
            System.out.println();
            System.out.print("Введите элементы массива: ");
            for (int i = 0; i < size; i++) {
                a[i] = in.nextInt();
            }
            return this;
        }
    }
}
