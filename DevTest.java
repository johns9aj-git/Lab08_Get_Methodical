import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test getNonZeroLenString
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);

        // Test getInt
        int number = SafeInput.getInt(in, "Enter an integer");
        System.out.println("You entered: " + number);

        // Test getDouble
        double decimal = SafeInput.getDouble(in, "Enter a decimal number");
        System.out.println("You entered: " + decimal);

        // Test getRangedInt
        int rangedNumber = SafeInput.getRangedInt(in, "Enter a number between 1 and 10", 1, 10);
        System.out.println("You entered: " + rangedNumber);

        // Test getRangedDouble
        double rangedDecimal = SafeInput.getRangedDouble(in, "Enter a decimal number between 0.5 and 9.5", 0.5, 9.5);
        System.out.println("You entered: " + rangedDecimal);

        // Test getYNConfirm
        boolean confirmation = SafeInput.getYNConfirm(in, "Do you want to continue? (Y/N)");
        System.out.println("You chose: " + (confirmation ? "Yes" : "No"));

        // Test getRegExString (Example: SSN Format)
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You entered: " + ssn);

        // Test prettyHeader
        SafeInput.prettyHeader("Welcome to SafeInput Testing!");

        in.close();
    }
}
