package Task_1;

import java.util.Scanner;

/*6.Ввести с консоли n целых чисел. На консоль вывести:
6.1. Четные и нечетные числа.
6.2. Наибольшее и наименьшее число.
6.3. Числа, которые делятся на 3 или на 9.
6.4. Числа, которые делятся на 5 и на 7.
6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
6.6. «Счастливые» числа.
6.7. Элементы, которые равны полусумме соседних элементов.*/
public class ex6 {
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
        int sum=0;
        int n=0;
        System.out.print("Нечетные элементы:");
        for(int x=0; x<a.length; x++)
        {
            if( a[x]%2-1==0 )
            {
                n++;
                sum += a[x];

                System.out.print(" " + a[x]);
            }
        }
        System.out.println();
        System.out.print("Четный элемент:");
        for(int x=0; x<a.length; x++) {
            if( a[x]%2==0 ) {
                n++;
                sum += a[x];

                System.out.print(" " + a[x]);
            }
        }
        System.out.println();
        int max = a[0], min = a[0];
        for(int i = 0; i < a.length; i++) {
            if(a[i] > max)
                max = a[i];

            if(a[i] < min)
                min = a[i];
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        System.out.print("Числа, которые делятся на 3 или на 9: ");
        for(int i = 0; i < a.length; i++) {
        if (a[i]%3==0 || a[i]%9==0)
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        System.out.print("Числа, которые делятся на 5 и на 7: ");
        for(int i = 0; i < a.length; i++) {
            if (a[i]%5==0 && a[i]%7==0)
                System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
}
