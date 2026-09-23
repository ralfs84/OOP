package ie.atu.oop.week1;

public class Book {
    public String title;
    public String author;
    public int pageCount;
    public boolean available = true;

    public void displayDetails()
    {
        System.out.println("This book is " + title);
        System.out.println("This book is written by  " + author);
        System.out.println("pages: " + pageCount);
        System.out.println("available: " + available);
        System.out.println("\n");
    }

    public void borrowBook()
    {
        if (available)
        {
            available = false;
            System.out.println("Borrowed successfully.");
        }
        else
        {
            System.out.println(title + " is not available.");
        }

    }



}


