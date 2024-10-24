public class CtoFTableDisplay {

    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%n", "Celsius", "Fahrenheit");
        System.out.println("------------------------");

        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = CtoF(celsius);
            System.out.printf("%-10d%-10.2f%n", celsius, fahrenheit);
        }
    }

    /**
     * Converts Celsius to Fahrenheit.
     *
     * @param Celsius the Celsius temperature
     * @return the equivalent Fahrenheit temperature
     */
    public static double CtoF(double Celsius) {
        return (Celsius * 9 / 5) + 32;
    }
}
