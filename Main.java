import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        SchoolSystem school1 = new SchoolSystem();
        school1.readFromFile();
        File file = new File("School System.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
          System.out.println(scan.nextLine());
        }
        boolean canContinue = true;
        while (canContinue)
            canContinue = school1.displayMainMenu();
    }
}
