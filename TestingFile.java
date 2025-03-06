import java.util.Scanner;

/**
 * A utility class for safe user input handling.
 */
public class SafeInput {

    /**
     * Ensures user input is a non-zero length string.
     * We can do this by making sure the user has to insert strings using do
     * while...
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) // Read user input & display string prompt for
                                                                          // user

    {
        String retString = ""; // String to be used later in the method.

        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0); // While stringLength is 0 repeat until user inputs something.

        return retString;
    }

    /**
     * Ensures user input is an integer.
     * 
     */
    public static int getInt(Scanner pipe, String prompt) { // Read user input & display string
        int value; // Assinging an int for later
        while (true) { // While user provides input check these conditions

            System.out.print("\n" + prompt + ": "); // Prompting the user for input. 
            if (pipe.hasNextInt()) // Sees if next scanner input is an int {
                value = pipe.nextInt();
                pipe.nextLine(); // Clear input buffer 
                return value;
            } else { // User has entered a non-integer. 
                System.out.println("Invalid input. Please enter a valid integer.");
                pipe.next(); // Clear invalid input
            }
        }

    }

    /**
     * Ensures user input is a double.
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double value; // Assigning a new double value
        while (true) {
            System.out.print("\n" + prompt + ": "); // Display prompt to user.
            if (pipe.hasNextDouble()) { // Checks if the next input from user is a double
                value = pipe.nextDouble();
                pipe.nextLine(); // Clear input buffer
                return value;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                pipe.next(); // Clear invalid input
            }
        }
    }

    /**
     * Ensures user input is an integer within a specified range.
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int value;
        do {
            value = getInt(pipe, prompt + " [" + low + " - " + high + "]"); // Allows user to specify low and high
                                                                            // values.
            if (value < low || value > high) {
                System.out.println("Out of range. Please enter a value between " + low + " and " + high + ".");
            }
        } while (value < low || value > high); // If the inserted value is below the low theshold or if high theshold is
                                               // passed repeat.
        return value;
    }

    /**
     * Ensures user input is a double within a specified range.
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    // Value must be a double within a certain range otherwise repeat...
    {
        double value; // Assign double

        do {
            value = getDouble(pipe, prompt + " [" + low + " - " + high + "]"); // Prompting user for input
            if (value < low || value > high) {
                System.out.println("Out of range. Please enter a value between " + low + " and " + high + "."); // Alerts
                                                                                                                // the
                                                                                                                // user
                                                                                                                // if
                                                                                                                // out
                                                                                                                // of
                                                                                                                // range
            }
        } while (value < low || value > high);
        return value;
    }

    /**
     * Ensures user input is a Yes or No confirmation.
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response;
        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine().trim().toLowerCase();
            if (response.equals("y")) // Checks user response
                return true;
            if (response.equals("n"))
                return false;
            System.out.println("Invalid input. Please enter Y or N.");
        } while (true);
    }

    /**
     * Ensures user input matches a specified regex pattern.
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input;
        do {
            System.out.print("\n" + prompt + ": ");
            input = pipe.nextLine();
            if (input.matches(regEx)) {
                return input;
            } else {
                System.out.println("Invalid input format. Please try again.");
            }
        } while (true);
    }

    /**
     * Displays a formatted header with a centered message.
     */
    public static void prettyHeader(String msg) {
        final int WIDTH = 60;
        int padding = (WIDTH - msg.length() - 6) / 2;
        String pad = " ".repeat(padding);

        System.out.println("*".repeat(WIDTH));
        System.out.println("***" + pad + msg + pad + (msg.length() % 2 == 0 ? "" : " ") + "***");
        System.out.println("*".repeat(WIDTH));
    }
}
