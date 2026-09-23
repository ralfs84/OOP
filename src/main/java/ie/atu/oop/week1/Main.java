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
        System.out.println("This book is writen by  " + firstbook.author);
        System.out.println("pages: " + firstbook.pageCount);
        System.out.println("available: " + firstbook.available);
    }
}