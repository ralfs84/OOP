package ie.atu.oop.week1;
import java.nio.file.Files;
import java.nio.file.Path;


public class PathExplorer
{
    public static void main(String[] args) {
        Path file = Path.of("data", "books.csv");

        System.out.println("Path: " + file);
        System.out.println("fileName: " + file.getFileName());
        System.out.println("path: " + file.toAbsolutePath());
        System.out.println("parrent path: " + file.getParent());
        System.out.println("exists: " + Files.exists(file));

    }
}




