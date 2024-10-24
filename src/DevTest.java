import java.util.Scanner;

public class DevTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test getRangedDouble method
        double testDouble = SafeInput.getRangedDouble(in, "Enter a value between 0.50 and 10.00", 0.50, 10.00);
        System.out.printf("You entered: %.2f%n", testDouble);

        in.close();
    }
}
