/**
 * IntegerArray -- one-dimensional arrays lab, exercise 5.
 *
 * Demonstrates a hard-coded (literal) integer array. The program does not
 * read any input -- it just prints the ten preset values.
 *
 * Compile:  javac IntegerArray.java
 * Run:      java IntegerArray
 */
public class IntegerArray {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("Integer array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}