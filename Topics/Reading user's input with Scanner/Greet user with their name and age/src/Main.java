import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize the Scanner object to receive user input
        Scanner sc = new Scanner(System.in);

        // Write your code for receiving user's name and age here.
        String name = sc.next();
        String age = sc.next();


        // Print the message using the user's name and age.

        System.out.println("Welcome, " + name + "! You are " + age + " years old.");

    }
}