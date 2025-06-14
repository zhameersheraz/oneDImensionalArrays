import java.util.Scanner;

public class arraySum {
    public static void main(String[] args) {

        Scanner array = new Scanner(System.in);

        int[] numbers = new int [5];
        int sum = 0;

        System.out.println("Enter 5 integer numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = array.nextInt();
            sum += numbers[i];
        }


        System.out.println("Sum: " + sum);


    }
}