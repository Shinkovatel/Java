package Homework.homework1;

import java.util.Scanner;

public class test1_1 {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = number.nextInt();
        System.out.printf("Треугольное число: %d\n", countNTriangle(a));
        number.close();
    }

    public static int countNTriangle(int n) {
        return (n * (n + 1)) / 2;
    }
}

// class Printer {
// public static void main(String[] args) {
// int n = 0;

// if (args.length == 0) {

// n = 4;
// } else {
// n = Integer.parseInt(args[0]);
// }
// // Вывод результата на экран

// Answer ans = new Answer();
// int itresume_res = ans.countNTriangle(n);
// System.out.println(itresume_res);
// }
// }