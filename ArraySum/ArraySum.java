import java.util.Scanner;

/**
 * ArraySum -- one-dimensional arrays lab, exercise 1.
 *
 * Reads {@value #SIZE} integers from standard input and prints their sum.
 *
 * Compile:  javac ArraySum.java
 * Run:      java ArraySum
 */
public class ArraySum {

    /** Number of integers to read. */
    private static final int SIZE = 5;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numbers = new int[SIZE];

            System.out.println("Enter " + SIZE + " integer numbers:");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = readInt(scanner);
            }

            int sum = 0;
            for (int n : numbers) {
                sum += n;
            }

            System.out.println("Sum: " + sum);
        }
    }

    /**
     * Reads one whole number from {@code scanner}, reprompting on bad input.
     * Prints the prompt before reading and an inline "Try again" hint on
     * non-integer input.
     */
    private static int readInt(Scanner scanner) {
        while (true) {
            System.out.print("  Enter integer: ");
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine(); // consume trailing newline
                return value;
            }
            System.out.println("  Not an integer. Try again.");
            scanner.next();
        }
    }
}