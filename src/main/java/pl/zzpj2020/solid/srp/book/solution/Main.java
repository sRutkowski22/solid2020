package pl.zzpj2020.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> pages = new HashMap<>();
        pages.put(1,"Hello world");
        pages.put(2,"To jest 2 strona");
        Book book = new Book(pages);
        Printer printer = new Printer(book);
        System.out.println(printer.printAllPages());


    }
}

