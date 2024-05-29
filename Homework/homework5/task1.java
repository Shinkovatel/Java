package Homework.homework5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class PhoneBook {
    static HashMap<String, ArrayList<Integer>> book = new HashMap<String, ArrayList<Integer>>();
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {

        // Введите свое решение ниже
        // ArrayList<Integer> list = new ArrayList<>();

        if (book.containsKey(name)) {
            book.get(name).add(phoneNum);
            Collections.sort(book.get(name), Collections.reverseOrder());
            book.put(name, book.get(name));
        } else {
            book.put(name, new ArrayList<>());
            book.get(name).add(phoneNum);
            book.put(name, book.get(name));
        }
    }

    public ArrayList<Integer> find(String name) {
        if (book.containsKey(name))
            return book.get(name);
        return new ArrayList<>();

    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        // Введите свое решение ниже

        return book;
    }

}

// Не удаляйте этот класс - он нужен для

public class task1 {
    public static void main(String[] args) {
        String name1;
        String name2;
        int phone1;
        int phone2;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            phone1 = 123456;
            phone2 = 654321;
        } else {
            name1 = args[0];
            name2 = args[1];
            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);

        System.out.println(myPhoneBook.find(name1));
        System.out.println(PhoneBook.getPhoneBook());
        System.out.println(myPhoneBook.find("Me"));
    }
}

// import java.util.ArrayList;
// import java.util.HashMap;

// class PhoneBook {
// private static HashMap<String, ArrayList<Integer>> phoneBook = new
// HashMap<>();

// public void add(String name, Integer phoneNum) {
// if (phoneBook.containsKey(name)) {
// phoneBook.get(name).add(phoneNum);
// } else {
// ArrayList<Integer> values = new ArrayList<>();
// values.add(phoneNum);
// phoneBook.put(name, values);
// }
// }

// public ArrayList<Integer> find(String name) {
// if (phoneBook.containsKey(name)) {
// return phoneBook.get(name);
// }
// return new ArrayList<Integer>();
// }

// public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
// return phoneBook;
// }
// }

// public class Printer {
// public static void main(String[] args) {
// String name1;
// String name2;
// int phone1;
// int phone2;

// if (args.length == 0) {
// name1 = "Ivanov";
// name2 = "Petrov";
// phone1 = 123456;
// phone2 = 654321;
// } else {
// name1 = args[0];
// name2 = args[1];
// phone1 = Integer.parseInt(args[2]);
// phone2 = Integer.parseInt(args[3]);
// }

// PhoneBook myPhoneBook = new PhoneBook();
// myPhoneBook.add(name1, phone1);
// myPhoneBook.add(name1, phone2);
// myPhoneBook.add(name2, phone2);

// System.out.println(myPhoneBook.find(name1));
// System.out.println(PhoneBook.getPhoneBook());
// System.out.println(myPhoneBook.find("Me"));
// }
// }