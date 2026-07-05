import java.util.Scanner;

/**
 * ArrayVowelCount -- one-dimensional arrays lab, exercise 2.
 *
 * Reads {@value #SIZE} characters from standard input and prints how many
 * of them are vowels (case-insensitive: a, e, i, o, u).
 *
 * Compile:  javac ArrayVowelCount.java
 * Run:      java ArrayVowelCount
 */
public class ArrayVowelCount {

    /** Number of characters to read. */
    private static final int SIZE = 8;

    /** Vowels in lowercase form; upper-case is handled by toLowerCase(). */
    private static final String VOWELS = "aeiou";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char[] characters = new char[SIZE];

            System.out.println("Enter " + SIZE + " characters:");
            for (int i = 0; i < characters.length; i++) {
                System.out.print("  character[" + i + "]: ");
                characters[i] = scanner.next().charAt(0);
            }

            int vowels = 0;
            for (char ch : characters) {
                if (VOWELS.indexOf(Character.toLowerCase(ch)) >= 0) {
                    vowels++;
                }
            }

            System.out.println("Number of vowel elements: " + vowels);
        }
    }
}