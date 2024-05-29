package Homework.homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// еализуйте метод, который принимает на вход целочисленный массив arr:
//- Создаёт список ArrayList, заполненный числами из исходого массива arr.
//- Сортирует список по возрастанию и выводит на экран.
//- Находит минимальное значение в списке и выводит на экран - Minimum is {число} - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
//- Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
//  Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:а

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        // int min = arr[0];
        // int max = arr[0];
        int sum = 0;
        int count = 0;
        Arrays.sort(arr);
        List<Integer> answer = Arrays.asList(arr);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count++;

            // if (arr[i] < min) {
            // min = arr[i];
            // } else if (arr[i] > max) {
            // max = arr[i];
            // }
        }
        double avg = (double) sum / arr.length;
        System.out.println(Arrays.toString(arr));
        System.out.println("максимальное значение: = " + Collections.min(answer));
        System.out.println("максимальное значение: = " + Collections.max(answer));
        System.out.println(avg);
    }
}

public class task2 {

    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[] { 4, 2, 7, 5, 1, 3, 8, 6, 9 };
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.analyzeNumbers(arr);
    }
}