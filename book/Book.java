package book;

import java.util.ArrayList;

public class Book {

    private static ArrayList<Book> collection = new ArrayList<>();

    private String title, author, isbn;
    
    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public static void addBook(Book book) {
        collection.add(book);
        System.out.println("Book added: " + book.title);
    }

    public static void removeBook(String isbn) {
        collection.removeIf(book -> book.isbn.equals(isbn));
        System.out.println("Book with ISBN " + isbn + " removed.");
    }

    public static void showAllBooks() {
        for (Book b : collection) {
            System.out.println(b.title + " by " + b.author + " (ISBN: " + b.isbn + ")");
        }
    }
}
