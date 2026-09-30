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
