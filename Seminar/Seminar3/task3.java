package Seminar.Seminar3;

import java.util.ArrayList;

// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.
public class task3 {

    public static void main(String[] args) {
        ArrayList str = new ArrayList<String>(10);// при создании листа <String> указывать после new, инициализированы.
                                                  // Если элементов 11 то система создаст массив на еще 10, т.е. на 20
                                                  // элементов.
                                                  // 10 элементов
        str.add("task1");
        str.add(1);
        str.add("hello");
        str.add(12);
        str.add(45);

        for (int i = 0; i < str.size(); i++) {

            // if (elem instanceof Integer) {
            if (str.get(i) instanceof Integer) {
                str.remove(str.get(i));
                i--;
            }
            System.err.println(str);
        }
    }
}
