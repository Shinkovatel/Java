package Homework.homework4;

import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}

class MyQueue<T> {
    // Напишите свое решение ниже

    LinkedList<T> ll = new LinkedList<>();

    public void enqueue(T element) { // Метод для добавления элемента в конец
        // Напишите свое решение ниже
        ll.addLast(element);
    }

    public T dequeue() { // Метод для удаления и возврата элемента из начала
        // Напишите свое решение ниже
        // return ll.get(0);
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return ll.removeFirst();
    }

    public boolean isEmpty() { // Метод для проверки, пуста ли очередь
        return ll.isEmpty();
    }

    public T first() {
        // Напишите свое решение ниже
        return ll.getFirst();
    }

    public LinkedList<T> getElements() {
        // Напишите свое решение ниже
        return ll;
    }
}
// public class MyQueue<T> {
// // Напишите свое решение ниже
// private LinkedList elements = new LinkedList<>();

// public MyQueue() {
// }

// public MyQueue(LinkedList<T> elements) {
// this.elements = elements;
// }

// public void enqueue(T element) {
// // Напишите свое решение ниже
// elements.addLast(element);
// }

// public T dequeue() {
// // Напишите свое решение ниже
// T first = elements.get(0);
// elements.remove(0);
// return first;
// }

// public T first() {
// // Напишите свое решение ниже
// return elements.getFirst();
// }

// public LinkedList<T> getElements() {
// // Напишите свое решение ниже
// return elements;
// }

// public void setElements(LinkedList<T> elements) {
// this.elements = elements;
// // }
// }

// class MyQueue<T> {
// private LinkedList<T> queue;//  [3]
// //
// //(https://javacodepoint.com/logical-programs/queue-implementation-using-linkedlist/)

// public MyQueue() {
// queue = new LinkedList<>();
// }//
//  [3]//(https://javacodepoint.com/logical-programs/queue-implementation-using-linkedlist/)

// Метод для добавления элемента в конец
// //
// очереди [3](https://javacodepoint.com/logical-programs/queue-implementation-using-linkedlist/)
// public void enqueue(T data) {
// queue.addLast(data);
// }//
//  [3](https://javacodepoint.com/logical-programs/queue-implementation-using-linkedlist/)[3](https://javacodepoint.com/logical-programs/queue-implementation-using-linkedlist/)

// Метод для удаления и возврата элемента из начала //
// очереди [3](https://javacodepoint.com/logical-programs/queue-implementation-using-linkedlist/)
// //

// public T dequeue() {
// if (isEmpty()) {
// throw new IllegalStateException("Queue is empty");
// }
// return queue.removeFirst();

// }//
//  [3](https://javacodepoint.com/logical-programs/queue-implementation-using-linkedlist/)[3](https://javacodepoint.com/logical-programs/queue-implementation-using-linkedlist/)

// Метод для проверки, пуста ли
// очередь [3](https://javacodepoint.com/logical-programs/queue-implementation-using-linkedlist/)
// public boolean isEmpty() {
// return queue.isEmpty();
// }
//  [3](https://javacodepoint.com/logical-programs/queue-implementation-using-linkedlist/)[3](https://javacodepoint.com/logical-programs/queue-implementation-using-linkedlist/)

// Метод для получения размера
// очереди [3](https://javacodepoint.com/logical-programs/queue-implementation-using-linkedlist/)
// public int size() {
// return queue.size();
// }//
//  [3](https://javacodepoint.com/logical-programs/queue-implementation-using-linkedlist/)[3](https://javacodepoint.com/logical-programs/queue-implementation-using-linkedlist/)
// }
