package ie.atu.oop.week1;

public class LibraryService
{
    private static final int MAX_LOAN_DAYS = 14;
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

}
