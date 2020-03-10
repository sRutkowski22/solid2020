package pl.zzpj2020.solid.srp.book.solution;

import java.util.Map;

public class Printer {
    private int currentPage = 0;
    Book book;

    public Printer(Book book){
        this.book = book;
    }

    public String getCurrentPageContents() {
        return this.book.getPages().get(currentPage);
    }
    public void turnPage() {
        currentPage++;
    }

    public void printCurrentPage() {
            System.out.println(book.getPages().get(currentPage));
    }

    public int getIndexOnShelf() {
        return book.getIndexOnShelf();
    }

    public String getLocationRowLocator() {
        return book.getRowLocator();
    }

    public String libraryRoomName() {
        return book.getLibraryRoomName();
    }

    public String printAllPages() {

        String allPages = new String();
        for(Map.Entry<Integer, String> page : book.getPages().entrySet()) {
            allPages += (page.getKey() + " " + page.getValue());
        }
        return  allPages;
    }
}

