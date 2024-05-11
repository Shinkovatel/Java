import java.sql.Array;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.xml.crypto.Data;

public class main3 {
    // public static void main(String[] args) {
    // String s = "hello";
    // String s1 = new String("hello");
    // int x = 0;
    // Integer y = 13;
    // System.out.println("равны? = " + (s == s1)); // строки не равны т.к. разные
    // адреса, можно сравнивать только
    // System.out.println("равны? = " + (s.equals(s1))); // функция для проверки
    // сравнения строк, у любого ссылочного
    // типа есть метод equals для сравнения
    // System.out.println(x < y);

    // ####################################################################################

    // System.out.println("Hello world!"); // обоснование метода, Ссылочный тип
    // System в нем обращаемся ко внутренней
    // переменной out(ссылочный тип данных PrintStream).
    // System.out.println(LocalDateTime.now()); // вывод времени.

    // ####################################################################################
    // Написать программу, которая попросит пользователя ввести "Имя" в консоли
    // Получит введенную строку и напечатает в консоль сообщение "Привет, "Имя"

    // System.out.println("Введите Имя:");
    // Scanner text = new Scanner(System.in); // text - объект класса scanner
    // String name1 = text.nextLine(); // возвращает строку
    // System.out.println("Привет, " + name1 + '!');
    // text.close();

    // ####################################################################################

    // while (true) { // бесконечный цикл
    // live();
    // }
    // char x = '[';

    // System.out.println(x);

    // public static void live() {
    // System.out.println("Сколько вам лет:");
    // Scanner text = new Scanner(System.in); // text - объект класса scanner
    // int age;
    // try { // Блок кода где может произойти исключение
    // age = text.nextInt();
    // if (age < 10) {
    // System.out.println("Возьми конфетку"); // IF проверяет последовательно, если
    // условию не удовлетворяет проверяет на следующее
    // } else if (age < 20) {
    // System.out.println("Возьми бутылку");
    // } else if (age < 70) {
    // System.out.println("Возьми очки");
    // } else {
    // System.out.println("Вы долгожитель");
    // }
    // } catch (InputMismatchException exception) { // Какую ошибку мы ожидаем
    // System.out.println("Вы ввели не число"); // что будем делать при этой ошибке
    // System.exit(0);
    // TODO: handle exception
    // }

    // System.out.println("Привет, " + name1 + '!');
    // text.close(); // если закрыть внутри цикла, то работать не будет, нужно
    // использовать если не зацикленно
    // }

    // public static void main(String[] args) {
    // char x = '[';
    // System.out.println(x);
    // x = 145;
    // System.out.println(x);
    // char x = x + 1;

    // ######################################################################
    // массивы
    // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    // int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
    // int[] arr2 = new int[5];

    // arr1[19] = 4;
    // System.out.println(Arrays.toString(arr1));
    // arr1[2] = 55;
    // System.out.println(Arrays.toString(arr1));
    // int sum = 0;for(
    // int i = 0;i<arr1.length;i++)
    // {
    // sum += arr1[i];
    // }System.out.println(sum);
    // System.out.println(Arrays.to(arr1));
    // }

    // ###########################################################################

    // "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

    public static void main(String[] args) {

        String str1 = "Добро пожаловать на курс по Java";
        String[] arr = str1.split(" ");
        System.out.println(Arrays.toString(arr));
        // Arrays.sort(arr, Collections.reverseOrder());
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(arr2));
        StringBuilder sb = new StringBuilder(); // для склейки много строк
        for (int i = arr.length - 1; i >= 0; i--) {
            String str2 = arr[i];
            sb.append(str2).append(" "); // для склейки много строк
        }
        System.out.println(sb);
    }
}
// Добро пожаловать на курс по Java" переставить слова в обратном порядке.
