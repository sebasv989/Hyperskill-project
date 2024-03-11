import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int d1 = (n1 + 1) / 2;
        int d2 = (n2 + 1) / 2;
        int d3 = (n3 + 1) / 2;

        int total = d1 + d2 + d3;

        System.out.println(total);

        scanner.close();
    }
}