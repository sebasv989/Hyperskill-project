import java.util.Scanner;  // necessary import statement

public class Main {

    public static void main(String[] args) {

        // Create new Scanner object for reading the input
        Scanner scanner = new Scanner(System.in);

        // Read a floating point number
        // USER INPUT REQUIRED HERE
        double num = scanner.nextFloat();

        // Round it down and square it
        // USER INPUT REQUIRED HERE
        double roundDown = Math.floor(num);
        int squaredNum = (int)roundDown * (int)roundDown;


        // Print the result
        // USER INPUT REQUIRED HERE
        System.out.println(squaredNum);

        // Remember to close the scanner to prevent resource leaks
        scanner.close();
    }
}