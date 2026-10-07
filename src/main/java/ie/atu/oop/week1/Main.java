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
    }
}



