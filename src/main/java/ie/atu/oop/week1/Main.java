package ie.atu.oop.week1;

public class Main {
    public static void main(String[] args) {
        Book first = new Book("Dune", "Frank Herbert", 412);
        Book second = new Book("Clean Code", "Robert C. Martin", 464);
        LibraryService service = new LibraryService();

        service.addBook(first);
        service.addBook(second);

        System.out.println("There are " + service.getBookCount() + " books.");

        for(Book book : service.getAllBooks())
        {
            System.out.println(book.getTitle());
        }
        Book found  = service.findBookByTitle("Dune");

        if(found != null)
        {
            System.out.println("Book found: "+found.getTitle());
        }
        Book missing = service.findBookByTitle("fortnite tips & tricks");
        if(missing == null)
        {
            System.out.println("book not found");
        }
        System.out.println("Remove Clean Code: "
                + service.removeBook("Clean Code"));
        System.out.println("Remove again: "
                + service.removeBook("Clean Code"));
        System.out.println("Books left: "
                + service.getBookCount());

    }
}



