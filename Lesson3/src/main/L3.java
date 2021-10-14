package main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class L3 {


    public static void main(String[] args) {
        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
        printArray();

        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        //calculateSumOfDiagonalElements();
        //   printMatrix();
        //countDevs(103);
        foobar(10);
        foobar(15);
        foobar(6);
        //    printMatrix();
        printPrimeNumbers();
    }


    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * далее создать одноменрый массив типа int размера прочитаного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a);
        int arr[] = new int[a];
        Random r = new Random();

        fillRandom(arr, 1000);
        System.out.println(Arrays.toString(arr));


    }


    public static void fillRandom(int[] arr, int n) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(n);

        }
    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        if (number > 0) {
            number++;
        } else if (number < 0) {
            number = number - 2;
        } else if (number == 0) {
            number = 10;

        }
        return number;
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int a = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {

                a++;

            }
        }

        return a;

    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    /*public static void countDevs(int count) {
       Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();
        System.out.println("COUNT программистов");
        //я в тупике, как то так
    }
    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        if (number % 3 == 0 && number % 5 != 0) {
            System.out.println("foo");

        } else if (number % 5 == 0 && number % 3 != 0) {
            System.out.println("bar");
        } else if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("foobar");
        }
    }

    /**
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */
    public static void printMatrix() {
        // тут пишем логику
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char mn = '*';
        char minus = '-';
        char plus = '+';
        int[][] arr = new int[a][b];
        Random r = new Random();
        int i = 0;
        int j = 0;
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                arr[i][j] = (r.nextInt(100));
                System.out.println(arr[i][j] + "\t");
            }
        }
        System.out.println("");
    }

    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
    public static void calculateSumOfDiagonalElements() {
        Scanner sc = new Scanner(System.in);
        int a, b, i, j;
        Random r = new Random();
        a = sc.nextInt();
        b = sc.nextInt();
        int[][] mat = new int[a][b];
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                mat[i][j] = (r.nextInt(100));
                if (i == j) //this condition checks for diagonal
                {
                    int sum = 0;
                    sum = sum + mat[i][j];
                }
            }
        }
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    private static void printPrimeNumbers() {

        for (int i = 2; i < 1000; ++i) {
            int count = 0;
            for (int j = 2; j <= i && count < 2; ++j) {
                if (i % j == 0) {
                    ++count;
                }
            }
            if (count < 2)
                System.out.println(i);
        }
    }
}
