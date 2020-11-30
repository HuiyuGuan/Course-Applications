public class Main {
    public static void main(String[] args) {

        SchoolSystem school1 = new SchoolSystem();

        boolean canContinue = true;
        while (canContinue)
            canContinue = school1.displayMainMenu();
    }
}
