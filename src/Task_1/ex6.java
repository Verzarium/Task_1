package Task_1;

import java.util.ArrayList;
import java.util.List;
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
        Integer[] sourceNumbers = new Integer[size];
        //6.1. Четные и нечетные числа.
        int sum = 0;
        int n = 0;
        System.out.print("Нечетные элементы:");
        for (int x = 0; x < a.length; x++) {
            if (a[x] % 2 - 1 == 0) {
                n++;
                sum += a[x];

                System.out.print(" " + a[x]);
            }
        }
        System.out.println();
        System.out.print("Четный элемент:");
        for (int x = 0; x < a.length; x++) {
            if (a[x] % 2 == 0) {
                n++;
                sum += a[x];

                System.out.print(" " + a[x]);
            }
        }
//6.2. Наибольшее и наименьшее число.
        System.out.println();
        int max = a[0], min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];

            if (a[i] < min)
                min = a[i];
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
//6.3. Числа, которые делятся на 3 или на 9.
        System.out.print("Числа, которые делятся на 3 или на 9: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0 || a[i] % 9 == 0)
                System.out.print(a[i] + " ");
        }
//6.4. Числа, которые делятся на 5 и на 7.
        System.out.println();
        System.out.print("Числа, которые делятся на 5 и на 7: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 == 0 && a[i] % 7 == 0)
                System.out.print(a[i] + " ");
        }
//6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
        System.out.println();
        findNumbersWithThreeDifferentDigits(sourceNumbers);
       /* for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if ((i != j) && (i != k) && (j != k)) {
                        System.out.print(i + j + k + " ");
                    }
                }
            }
        }*/
        //6.6. «Счастливые» числа.
       findHappyNumbers(sourceNumbers);
        //6.7. Элементы, которые равны полусумме соседних элементов.
        findNumbersOfHalfSumOfNeighbors(sourceNumbers);
    }
//6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
    private static void findNumbersWithThreeDifferentDigits(Integer[] sourceNumbers) {
        String number;
        List<Integer> result = new ArrayList<Integer>();
        for (Integer sourceNumber : sourceNumbers) {
            number = sourceNumber.toString();
            if (number.length() == 3 && number.charAt(0) != number.charAt(1) && number.charAt(1) != number.charAt(2)
                    && number.charAt(0) != number.charAt(2)) {
                result.add(sourceNumber);
            }
        }
        System.out.println("Все трехзначные числа, "
                + "в десятичной записи которых нет одинаковых цифр: " + result);
    }
    //6.6. «Счастливые» числа.
    private static void findHappyNumbers(Integer[] sourceNumbers) {
        String number;
        List<Integer> result = new ArrayList<Integer>();
        for (Integer sourceNumber : sourceNumbers) {
            number = sourceNumber.toString();
            if (number.length() == 4
                    && number.charAt(0) + number.charAt(1) == number.charAt(2)
                    + number.charAt(3)) {
                result.add(sourceNumber);
            }
        }
        System.out.println("“Счастливые” числа (Сумма 1-ой пары чисел "
                + "= Сумме 2-ой пары): " + result);
    }
    //6.7. Элементы, которые равны полусумме соседних элементов.
    private static void findNumbersOfHalfSumOfNeighbors(Integer[] sourceNumbers) {
        Integer[] numbers = sourceNumbers.clone();
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers.length < 3) {
                break;
            }
            if (numbers[i] == (numbers[i - 1] + numbers[i + 1]) / 2) {
                result.add(numbers[i]);
            }
        }
        System.out.println("Элементы, которые равны полусумме соседних "
                + "элементов: " + result);
    }
}
