package Lession.Lession4;

import java.util.LinkedList;

// Приоритетные коллекции

// LinkedList - двухсвязнный список - информация храниться о следующем и
// предыдущем.
// Односвязный список - информация о следующем элементе храниться в предыдущем
// Циклический односвязный список - информация что идет после последнего
// элемента, который является первым
// Циклический двухсвязный список - после последнего элемента идет первый и
// перед первым идет последний
// Список - гибкая структура данных, позволяющаяя легко менять свой размер.
// Элементы доступны для вставки или удаления в любой позиции.
// Массив размещается так... Данные идут не друг за другом...(может
// располагаться не рядом с другим)
// Удаление массива, паровозим тянем и перезаписываем
// LinkedList - четко использует свободный участок.... первый элемент знает где
// расположен 2 элемент...При добавлении меняется ссылка (подмена ссылки)
// Когда постоянно удалять или добавлять...выгоднее LinkedList, постоянно
// считывать... выгоднее массив.
//

//
// public class task {
// public static void main(String[] args) {
// LinkedList<Integer> ll = new LinkedList<Integer>();
// ll.add(1);
// ll.add(2);
// ll.add(3);
// }

// }

// Queue - FIFO

// Queue<Integer>queue=new LinkedList<Integer>();queue.add(1);int
// item=queue.remove(1);

// System.out.println(queue); // [1, 2, 3, 4]
// int item = queue.remove();
// System.out.println(queue); // [2, 3, 4]
// queue.offer(2809);
// item = queue.remove();
// System.out.println(queue); // [3, 4, 2809]
// item = queue.remove();
// System.out.println(queue); // [4, 2809]
// item = queue.poll();
// System.out.println(queue); // [2809]

// Prority - queue - наименьший приоритет имеет "наименьший" элемент

ProrityQueue<Integer>pq=new ProrityQueue<Integer>();pq.add(17);pq.add(2);pq.add(3); // напечатаются по наименьшему числу

// Deque - линейная коллекция, которая поддерживает вставку и удаление элементов
// на обоих концах

import java.util.*;

public class task {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.removeLast();
        deque.removeLast();
        deque.offerFirst(1);
        deque.offerLast(2);
        deque.pollFirst();
        deque.pollLast();
        deque.getFirst();
        deque.getLast();
        deque.peekFirst();
        deque.peekLast();
    }
}

// Stack - FiLO


package Lesson_04;

import java.util.Stack;

public class Ex005 {

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        // (1+2*3*4)*(10/5) - 20
        // 1 2 3 * 4 * + 10 5 / * 20 -
        
        //var exp = "20 30 - 10 *".split(" "); // (20-30)*10
        var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3
        
        //var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        int res = 0;
        System.out.println(exp);
        
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res =  st.pop()/ st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }
}