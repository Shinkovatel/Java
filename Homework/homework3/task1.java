package Homework.homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Дан произвольный массив целых чисел. Создайте список ArrayList, заполненный данными из этого массива. Необходимо удалить из списка четные числа и вернуть результирующий.

// Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers принимает на вход один параметр: Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>

public class task1 {

  public static void main(String[] args) {
    Integer[] arr = {};

    if (args.length == 0) {
      // При отправке кода на Выполнение, вы можете варьировать эти параметры
      arr = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    } else {
      arr = Arrays.stream(args[0].split(", "))
          .map(Integer::parseInt)
          .toArray(Integer[]::new);
    }

    Answer ans = new Answer();
    ans.removeEvenNumbers(arr);
  }
}

class Answer {
  public static void removeEvenNumbers(Integer[] arr) {
    // Введите свое решение ниже

    List<Integer> number = new ArrayList<Integer>(); // создаем лист, при создании List - писать <Integer List<String>
                                                     // myList = new ArrayList<String>();
    for (int ifNum = 0; ifNum < arr.length; ifNum++) { // прогоняем массив данных arr
      if (arr[ifNum] % 2 != 0) { // Проверяем если не делится на 2 без остатка
        number.add(arr[ifNum]); // записываем в новый массив
      }
    }
    System.out.println(number);
  }
}

// for (Iterator<Integer> iterator = number.iterator(); iterator.hasNext();) {
// Integer arr= iterator.next();
// if (number % 2 == 0) {
// System.out.println("This is Even Number: " + number1);
// iterator.remove();
// }