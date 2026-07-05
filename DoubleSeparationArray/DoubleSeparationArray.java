import java.util.Scanner;

/**
 * DoubleSeparationArray -- one-dimensional arrays lab, exercise 4.
 *
 * Reads {@value #SIZE} doubles from standard input and prints them back out
 * tab-separated, each formatted to three decimal places.
 *
 * Compile:  javac DoubleSeparationArray.java
 * Run:      java DoubleSeparationArray
 */
public class DoubleSeparationArray {

    /** Number of doubles to read. */
    private static final int SIZE = 6;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] numbers = new double[SIZE];

            System.out.println("Enter " + SIZE + " double values:");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = readDouble(scanner);
            }

            System.out.println("Array elements:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.printf("%.3f\t", numbers[i]);
            }
            System.out.println();
        }
    }

    /**
     * Reads one double from {@code scanner}, reprompting on bad input.
     */
    private static double readDouble(Scanner scanner) {
        while (true) {
            System.out.print("  Enter number: ");
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                scanner.nextLine(); // consume trailing newline
                return value;
            }
            System.out.println("  Not a number. Try again.");
            scanner.next();
        }
    }
}