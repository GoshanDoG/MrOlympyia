import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C://project//products.txt");
            Scanner scanner = new Scanner(reader);
            System.out.println(scanner.next());
        } catch (Exception e) {
            System.out.println("файл не найден");
        }
    }
}
