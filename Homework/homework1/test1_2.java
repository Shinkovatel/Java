package Homework.homework1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class test1_2 {
    public static void main(String[] args) {
        System.out.println("Введите первое число промежутка");
        Scanner firstnumber = new Scanner(System.in);
        int a = firstnumber.nextInt();
        // if (a == 1) {
        // a = 2;
        // }

        // // firstnumber.close();

        System.out.println("Введите последнее число промежутка");
        Scanner lastnumber = new Scanner(System.in);
        // lastnumber.close();
        int z = lastnumber.nextInt();
        System.out.println(a);
        System.out.println(z);
        // int x = z - a;
        int[] arr = IntStream.rangeClosed(a, z).toArray();
        System.out.println(Arrays.toString(arr));

        long div = 0;
        for (long i = a; i <= z; i++) { // Перебор чисел в указанном диапазоне
            for (long j = 1; j <= i; j++) { // перебираем делимость числа на целое
                if (i % j == 0)
                    div++; // считаем делители
            }
            if (div == 2) { // делителей 2
                System.out.print(i + ",");
            }
            div = 0;
        }
    }
    // int i = 0;
    // int x = 2;
    // while (i < arr.length) {
    // if (arr[i] % x != 0) {
    // x++;
    // System.out.println(arr[i]);
    // // arr[i] = arr[i + 1];
    // } else if (arr[i] % x == 0) {
    // arr[i] = arr[i + 2];
    // }
    // i++;
    // if (i = a; i < arr.length; i++) {

}
// class Answer {
// public void printPrimeNums(){

// int n = 0;
// if ()

// }
// }

// // Не удаляйте этот класс - он нужен для вывода результатов на экран и
// проверки
// class Printer {
// public static void main(String[] args) {
// Answer ans = new Answer();
// ans.printPrimeNums();
// }
