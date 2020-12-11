import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SchoolSystem school1 = new SchoolSystem();

        File file = new File("School System.txt");
        try {
        file.createNewFile(); // if file does not already exist, this will create one with specified name above
        school1.readFromFile();
        school1.copyFile();
        school1.copyFile1();
        school1.copyFile2();
        school1.copyFile3();
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
          System.out.println(scan.nextLine());
        }
        boolean canContinue = true;
        while (canContinue)
            canContinue = school1.displayMainMenu();
            scan.close();
            school1.writeToFile();
          } catch(IOException e) {
            System.out.println("File not found");
          }
    }
}
