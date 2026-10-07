# OOP lab 1: Java Book Tracker.

## Run
open the project in intelliJ with JDK 21+ and run Main.java

## Object model
The book class has 2 string variables called title and author
and one int variable called pages and one boolean variable called available.\
displayDetails() is created to reduce code clutter for multiple books and prints out details for title,author,book pages and availability of the book.




createBook is separate from Main so it can be reused.

borrowBook checks if available is true and then changes it to false and prints out a message.
if available is false it prints out a message stating the book is not available.


## Verification
hello is printed. \
book 1 - 3 details are printed. \
book 1 is borrowed.\
text that confirms the book is borrowed.\
book 1 is printed again to show the change of availability.

# OOP lab 3: Encapsulated Library
## JDK version and Java package
JDK 21+ BookTracker1-1.0

### Why the constructor checks for null before calling isBlank().

the constructor checks for null first as it is 
quicker than calling a function first

### Why title, author and pageCount are final while status is not.

a book's name,author or page count should not
need to change while status needs to change 
when a book is borrowed or returned

### Why Book uses borrowBook and returnBook rather than a status setter.
Book uses borrowBook and ReturnBook as it throws
an exception if the book is already returned
or borrowed.

### checks
book checks: \
title or author not null or blank. \
page count <=0.\
status in borrowBook() and returnBook(). \

LibraryService checks: \
if inputted book is null. \
if loan days are >0 and <= 14 (LOAN_MAX_DAYS).

### results
successful loan : status changes from AVAILABLE
to ON_LOAN \
rejected loan: Throws exception book can't be 
null or Loan Days must be between 1 and 14. \
rejected return: Throws exception book can't be
null. \
maven build : successful build.


###  debugger observations
the fifteen-day call errors before it can reach
book.borrowBook() since it does not fit
the criteria of the if statement which checks
if loanDays are >1 or <=14 which runs before
book.borrowBook()
 
The first book is available before the 
fifteen-day call because the bookReturn() is
called which changes the status of book 1.

 ## Lab 4 Collections: Build a Library Catalogue
The lab 4 changes in libraryService added an arraylist,findBookBytitle() and
removeBook() and updated loanbook() and returnbook()  with search capabilities.


List<Book> tells the compiler to list all the elements that
belong to book.

Final does not prevent book.add() because Final allows objects
to change not variables. the components of the array may change
but the variable list<book> books will always refer to the same
array.


The enhanced for loop variables represents a simple way to
iterate arrays.

findBookByTitle returns the title of searched book otherwise
returns null.

removeBook resues findBookByTitle as writing another search
loop would be redundant code.

main responsibilities are to add books to the library

LibraryService responsibilities are to manage the book database e.g.

Book responsibilities deals with the aspects of a single book e.g. page count
, author or  name.