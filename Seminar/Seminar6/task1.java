package Seminar.Seminar6;

import java.time.LocalDate;
import java.util.*;

public class task1 {
    static Map<String, Set<Integer>> phoneBook = new HashMap<>();

    public static void main(String... args) {
        // Cat murzik = new Cat(1, "Мурзик", LocalDate.now());

        phoneBook.put("Alex", new HashSet<>());
        phoneBook.put("Dima", new TreeSet<>());
        phoneBook.put("Gena", new LinkedHashSet<>());
        phoneBook.put("Sasha", new TreeSet<>());

        addNumber("Alex", 1);
        addNumber("Alex", 2);
        addNumber("Alex", 3);
        addNumber("Gena", 10);

        System.out.println(phoneBook);
    }

    private static void addNumber(String key, int num) {
        phoneBook.get(key).add(num);
    }

    private static void foo() {
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(5555555);
        set1.add(46585);
        set1.add(-14983);
        set1.add(8888888);
        set1.add(0);

        print(set1);
    }

    private static void print(Set<Integer> set) {
        System.out.println(set);
    }
}
