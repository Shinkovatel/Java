package Seminar.Seminar3;
// Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, что 

import java.util.ArrayList;
import java.util.List;

// на 0-й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.

public class task4 {
    static List<ArrayList<String>> books = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<String> proza = new ArrayList<>(List.of("proza", "War and world", "Buratos"));
        ArrayList<String> poezia = new ArrayList<>(List.of("poezia", "Borodino", "Evgeniy Onegin"));
        ArrayList<String> skazki = new ArrayList<>();
        skazki.add("skazki");
        skazki.add("masha and Bear");
        skazki.add("Red Heat");
        // System.err.println(proza);
        // System.err.println(poezia);
        // System.err.println(skazki);
        // for(int i = 0; i < args.length; i++) {

        // }

        books.addAll(List.of(proza, poezia, skazki));

        System.out.println(books);

    }
    public static void main(String[] args)
    dsd
    sds

}
