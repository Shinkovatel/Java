package Homework.homework4;

import java.util.Collections;
import java.util.LinkedList;

public class task1 {

    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();

        if (args.length == 0 || args.length != 4) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }

        LLTasks answer = new LLTasks();
        System.out.println(ll);
        LinkedList<Object> reversedList = answer.revert(ll);
        System.out.println(reversedList);
    }
}

class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        // Напишите свое решение ниже
        // LinkedList<Object> newLl = new LinkedList<Object>();

        // for (Object item : ll) {
        // newLl.addFirst(item);
        // }

        // return newLl;

        // LinkedList reversedList new LinkedList<>;

        // for (int i linkedList.size ⸺ 1; i > 0; i--) {
        // reversedList.​add(linkedList.​get(i));
        // }

        // linkedList.clear;
        // linkedList.​addAll(reversedList);

        Collections.reverse(ll);
        return ll;

    }
}