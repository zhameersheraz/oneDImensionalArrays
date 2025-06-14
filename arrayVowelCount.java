import java.util.Scanner;

public class arrayVowelCount {
    public static void main(String[] args) {

        Scanner elements = new Scanner(System.in);

        char[] charzzz = new char[8];
        int vowels = 0;

        System.out.println("Enter 8 characters:");

        for(int i = 0; i < charzzz.length; i++) {
            charzzz[i] = elements.next().charAt(0);

            if (charzzz[i] == 'a' || charzzz[i] == 'e' || charzzz[i] == 'i' ||
                    charzzz[i] == 'o' || charzzz[i] == 'u' ||
                    charzzz[i] == 'A' || charzzz[i] == 'E' || charzzz[i] == 'I' ||
                    charzzz[i] == 'O' || charzzz[i] == 'U') {
                vowels++;

            }

        }

        System.out.println("Number of vowel elements: " + vowels);

    }
}