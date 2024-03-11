import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String word = scanner.nextLine();
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        System.out.println(word.substring(firstNum,secondNum + 1));

        scanner.close();

    }
}