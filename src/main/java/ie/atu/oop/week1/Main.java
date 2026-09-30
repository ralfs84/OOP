package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        try
        {
            Book myBook = new Book("Dune", "Franky", 123);
            System.out.println(myBook.getTitle());
            System.out.println(myBook.getAuthor());
            System.out.println(myBook.getPageCount());

            System.out.println( myBook.getStatus());
            myBook.BorrowBook();
            try{
                myBook.BorrowBook();
            } catch(IllegalStateException e){
                System.out.println(e.getMessage());
            }

            System.out.println( myBook.getStatus());
        }
        catch(IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }



    }

}