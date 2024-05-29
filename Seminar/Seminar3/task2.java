package Seminar.Seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.
public class task2 {
    public static void main(String[] args) {
        List<Integer> intlist = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            intlist.add(r.nextInt(0, 10));
        }
        System.err.println(intlist);
        Collections.sort(intlist);
        System.err.println(intlist);
        System.err.println(Collections.max(intlist));
    }
}