package ie.atu.oop.week1;

import java.util.Scanner;

public class ExceptionWarmUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        boolean valid = false;

        while (!valid)
        {
            System.out.println("Enter a page number: ");
            String text = scan.nextLine();

            try {
                int pageCount = Integer.parseInt(text);
                System.out.println("You entered: " + pageCount);
                valid = true;
            }
            catch (NumberFormatException anything)
            {
                System.out.println("You entered an invalid page number");
            }
        }

    }
}
