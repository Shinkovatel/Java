package Lession.Lession5;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class task1 {
    // MAP нужно указывать два типа

    // hash - функция которая возвращает число(значение).
    // МАР - множество коллекций, работающих с данными по принципу ключ/значение
    // особенности - ускоренная обработка данных
    // - порядок добавления не запоминается
    // hashМАР - элементы располагаются как угодно и могут менять свое место
    // положение

    // Ключевые особенности:
    // ● допускаются только уникальные ключи, значения
    // могут повторяться;
    // ● помните про null значения*;
    // ● ускоренная обработка данных;
    // ● порядок добавления не запоминается.

    // put(K,V) – добавить пару если или изменить значение,если ключ имеется.
    // putIfAbsent(K,V) – произвести добавление если ключ не найден.
    // get(K) - получение значения по указанному ключу.
    // remove(K) – удаляет пару по указанному ключу.
    // containsValue(V) – проверка наличия значения.
    // containsKey(V) – проверка наличия ключа.
    // keySet() – возвращает множество ключей.
    // values() – возвращает набор значений.

    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<Integer, String>();
        db.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(null, "!null");
        System.out.println(db); // {null=!null, 1=один, 2=два}
        System.out.println(db.get(44));
        // db.remove(null);
        System.out.println(db); // {1=один, 2=два}
        System.out.println(db.containsValue("один")); // true проверки значений
        System.out.println(db.containsValue(1)); // false
        System.out.println(db.containsKey("один")); // false
        System.out.println(db.containsKey(1)); // true проверка ключа
        System.out.println(db.keySet()); // коллекция ключей
        System.out.println(db.values()); // коллекция значений

    }

    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(3, "три");
        System.out.println(db);

        for (var item : db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
    }

    public class Ex003_HashMapBoost {
        public static void main(String[] args) {
            Map<Integer, String> map1 = new HashMap<>();
            Map<Integer, String> map2 = new HashMap<>(30);
            Map<Integer, String> map3 = new HashMap<>(30, 0.8f);
        }
    }

    // Методы
    // put(K,V) get(K) remove(K)
    // descendingMap() tailMap() headMap() lastEntry() firstEntry()
    public class Ex004_TreeMap { // дерево
        public static void main(String[] args) {
            TreeMap<Integer, String> tMap = new TreeMap<>();
            tMap.put(1, "один");
            System.out.println(tMap);
            // {1=один}
            tMap.put(6, "шесть");
            System.out.println(tMap);
            // {1=один, 6=шесть}
            tMap.put(4, "четыре");
            System.out.println(tMap);
            // {1=один, 4=четыре, 6=шесть}
            tMap.put(3, "три");
            System.out.println(tMap);
            // {1=один, 3=три, 4=четыре, 6=шесть}
            tMap.put(2, "два");
            System.out.println(tMap);
            // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}
        }
    }

    // “Старший брат” коллекции HashMap, который всё помнит…
    // Помнит порядок добавления элементов ➜ более медлительный
    // Map<Integer,String> linkmap = new LinkedHashMap<>();

    public class Ex005_LinkedHashMap {
        public static void main(String[] args) {
            Map<Integer, String> linkmap = new LinkedHashMap<>();
            linkmap.put(11, "один один");
            linkmap.put(1, "два");
            linkmap.put(2, "один");
            System.out.println(linkmap); // {11=один один, 1=два, 2=один}
            Map<Integer, String> map = new HashMap<>();
            map.put(11, "один один");
            map.put(2, "два");
            map.put(1, "один");
            System.out.println(map); // {1=один, 2=два, 11=один один}
        }
    }

    public class Ex006_HashTable {
        public static void main(String[] args) {
            Map<Integer,String> table = new Hashtable<>();
            table.put(1, "два");
            table.put(11, "один один");
            table.put(2, "один");
            System.out.println(table); // {2=один, 1=два, 11=один один}
            // table.put(null, "один"); //  java.lang.NullPointerException
        }
    }
}