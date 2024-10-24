import java.util.Scanner;

public class SafeInput {

    /**
     * Prompts the user for a double value within a specific range.
     *
     * @param pipe   a Scanner object to read user input
     * @param prompt the message to display as a prompt
     * @param min    the minimum acceptable value
     * @param max    the maximum acceptable value
     * @return a valid double value entered by the user
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double min, double max) {
        double retValue = 0.0;
        boolean valid = false;
        do {
            System.out.print(prompt + " (between " + min + " and " + max + "): ");
            if (pipe.hasNextDouble()) {
                retValue = pipe.nextDouble();
                if (retValue >= min && retValue <= max) {
                    valid = true;
                } else {
                    System.out.println("Input out of range. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid double.");
                pipe.next(); // Clear invalid input
            }
        } while (!valid);
        pipe.nextLine(); // Consume the newline character
        return retValue;
    }
}
