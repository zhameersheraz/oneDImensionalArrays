import java.util.Scanner;

public class averageOfFloatingPointNumbers {
    public static void main(String[] args) {

        Scanner flt = new Scanner(System.in);

        double[] floatzzz = new double [10];
        double sum = 0;

        System.out.println("Enter 10 floating-point numbers: ");
        for (int i = 0; i < floatzzz.length; i++) {
            floatzzz[i] = flt.nextDouble();
            sum += floatzzz[i];
        }


        double average = sum / floatzzz.length;
        System.out.printf("The average is: %.2f%n", average);


    }
}