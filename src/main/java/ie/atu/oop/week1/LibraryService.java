package ie.atu.oop.week1;

import java.util.ArrayList;
import java.util.List;

public class LibraryService
{
    private static final int MAX_LOAN_DAYS = 14;
    private final List<Book> books = new ArrayList<>();
    public void loanBook(Book book, int loanDays)
    {
        if (book == null)
        {
            throw new NullPointerException("Book cant be null");

        }
        if(loanDays < 1 || loanDays > MAX_LOAN_DAYS)
        {
            throw new IllegalArgumentException("Loan Days must be between 1 and 14");
        }
        book.BorrowBook();
    }
    public void returnBook(Book book)
    {
        if (book == null)
        {
            throw new NullPointerException("Book cant be null");

        }
        book.ReturnBook();
    }
    public void addBook(Book book)
    {
        if (book == null)
            {
            throw new NullPointerException("Book cant be null");
            }
        books.add(book);
    }
    public int getBookCount()
    {
        return books.size();
    }

    public List<Book> getAllBooks()
    {
        return new ArrayList<>(books);
    }
}
