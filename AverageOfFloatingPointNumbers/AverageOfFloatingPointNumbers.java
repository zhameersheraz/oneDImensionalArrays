import java.util.Scanner;

/**
 * AverageOfFloatingPointNumbers -- one-dimensional arrays lab, exercise 3.
 *
 * Reads {@value #SIZE} doubles from standard input and prints their
 * arithmetic mean to two decimal places.
 *
 * Compile:  javac AverageOfFloatingPointNumbers.java
 * Run:      java AverageOfFloatingPointNumbers
 */
public class AverageOfFloatingPointNumbers {

    /** Number of doubles to read. */
    private static final int SIZE = 10;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] values = new double[SIZE];

            System.out.println("Enter " + SIZE + " floating-point numbers:");
            for (int i = 0; i < values.length; i++) {
                values[i] = readDouble(scanner);
            }

            double sum = 0;
            for (double v : values) {
                sum += v;
            }
            double average = sum / values.length;

            System.out.printf("The average is: %.2f%n", average);
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