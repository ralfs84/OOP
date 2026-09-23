package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("hello");

        Book firstBook = new Book();
        firstBook.title = "Bune";
        firstBook.author = "Brank Berbert";
        firstBook.pageCount = 4;

        firstBook.displayDetails();

        Book secondBook = new Book();
        secondBook.title = "Bune 2";
        secondBook.author = "Ralfs Vilsars";
        secondBook.pageCount = 21;
        secondBook.available = true;

        secondBook.displayDetails();
    }
}