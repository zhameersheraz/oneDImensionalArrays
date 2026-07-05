import java.util.Scanner;

public class doubleSeparationArray {
    public static void main(String[] args) {
        Scanner arrayzzz = new Scanner(System.in);

        double[] numbers = new double[6];

        System.out.println("Enter 6 double values:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = arrayzzz.nextDouble();
        }

        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%.3f\t", numbers[i]);
        }

    }
}