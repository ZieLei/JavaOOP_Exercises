package library;

public class LibraryMain {
    public static void main(String[] args) {
        Library schoolLibrary = new Library();
        
        schoolLibrary.addBook("C the programming language");
        schoolLibrary.addBook("C++ for dummies");
        schoolLibrary.addBook("Python for snakes");

        schoolLibrary.listBooks();

        schoolLibrary.removeBook("Python for snakes");

        schoolLibrary.listBooks();
    }
}
