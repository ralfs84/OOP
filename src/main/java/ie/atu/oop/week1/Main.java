package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("hello");

        Book firstbook = new Book();
        firstbook.title = "Bune";
        firstbook.author = "Brank Berbert";
        firstbook.pageCount = 4;

        System.out.println("This book is " + firstbook.title);
        System.out.println("This book is written by  " + firstbook.author);
        System.out.println("pages: " + firstbook.pageCount);
        System.out.println("available: " + firstbook.available);
        System.out.println("\n");

        Book secondbook = new Book();
        secondbook.title = "Bune 2";
        secondbook.author = "Ralfs Vilsars";
        secondbook.pageCount = 21;
        secondbook.available = true;

        System.out.println("This book is " + secondbook.title);
        System.out.println("This book is written by  " + secondbook.author);
        System.out.println("pages: " + secondbook.pageCount);
        System.out.println("available: " + secondbook.available);
        System.out.println("\n");
    }
}