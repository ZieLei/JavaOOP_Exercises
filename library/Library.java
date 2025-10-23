package library;

import java.util.ArrayList;

public class Library {
    
    private ArrayList<String> books = new ArrayList<>();

    public void addBook(String bookName){
        books.add(bookName);
    }

    public void removeBook(String bookName){
        books.remove(bookName);
    }

    public void listBooks(){
        System.out.println("Books: " + books);
    }
}
