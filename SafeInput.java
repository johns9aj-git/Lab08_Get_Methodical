import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner in, String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNonZeroLenString'");
    }

    public class GetUserName {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String firstName = "";
            String lastName = "";
            firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
            lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
            System.out.println("\nYour full name is: " + firstName + " " + lastName);
        }
    }

}
