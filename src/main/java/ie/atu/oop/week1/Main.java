package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("hello");

        Book firstBook = createBook("Bune","Brank Berbert",4);
        Book secondBook = createBook("Bune 2 ","Balfs Bilsars",21);
        Book thirdBook = createBook("Barry Botter ","Bames Bellman",53);

        firstBook.displayDetails();
        secondBook.displayDetails();
        thirdBook.displayDetails();

        System.out.println("\n");
        firstBook.borrowBook();
        System.out.println("\n");
        firstBook.displayDetails();



    }

    private static Book createBook(String title, String author, int pageCount)
    {
        Book book = new Book();
        book.title = title;
        book.author = author;
        book.pageCount = pageCount;
        return book;
    }
}

