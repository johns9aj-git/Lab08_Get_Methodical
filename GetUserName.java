import java.util.Scanner;

/**
 * A utility class for safe user input handling.
 */
public class SafeInput {

    /**
     * Ensures user input is a non-zero length string.
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    /**
     * Ensures user input is an integer.
     */
    public static int getInt(Scanner pipe, String prompt) {
        // Placeholder for method implementation
        return 0;
    }

    /**
     * Ensures user input is a double.
     */
    public static double getDouble(Scanner pipe, String prompt) {
        // Placeholder for method implementation
        return 0.0;
    }

    /**
     * Ensures user input is an integer within a specified range.
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        // Placeholder for method implementation
        return 0;
    }

    /**
     * Ensures user input is a double within a specified range.
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        // Placeholder for method implementation
        return 0.0;
    }

    /**
     * Ensures user input is a Yes or No confirmation.
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        // Placeholder for method implementation
        return false;
    }

    /**
     * Ensures user input matches a specified regex pattern.
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        // Placeholder for method implementation
        return "";
    }

    /**
     * Displays a formatted header with a centered message.
     */
    public static void prettyHeader(String msg) {
        // Placeholder for method implementation
    }
}
