package book;

public class BookMain {
    public static void main(String[] args) {

        //Manga 
        Book alyaSometimesHidesHerFeelingsInRussian = new Book("時々ボソッとロシア語でデレる隣のアーリャさん", "Saho Tenamachi", "0-306-40615-2");

        Book.addBook(alyaSometimesHidesHerFeelingsInRussian);

        Book.showAllBooks();

        Book.removeBook("0-306-40615-2");

        Book.showAllBooks();
    }

}
