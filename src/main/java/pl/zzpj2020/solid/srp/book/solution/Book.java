package pl.zzpj2020.solid.srp.book.solution;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

public @Data
class Book {

    private Map<Integer, String> pages = new HashMap<>();
    public String title;
    public String author;
    private String libraryRoomName;
    private String rowLocator;
    private int indexOnShelf;

    public Book(Map<Integer, String> pages){
        this.pages=pages;
    }
}
