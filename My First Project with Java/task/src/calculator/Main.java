package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $202");
        System.out.println("Toffee: $118");
        System.out.println("Ice cream: $2250");
        System.out.println("Milk chocolate: $1680");
        System.out.println("Doughnut: $1075");
        System.out.println("Pancake: $80");

        String income = "5405";
        System.out.println("\n" + "Income: $" + income);
        System.out.println("Staff expenses: ");

        Scanner userInput = new Scanner(System.in);
        String staffExpenses = userInput.nextLine();

        System.out.println("Other expenses: ");
        String otherExpenses = userInput.nextLine();

        int incomeConvertion = Integer.valueOf(income);
        int staffExpenseConvertion = Integer.valueOf(staffExpenses);
        int otherExpenseConvertion = Integer.valueOf(otherExpenses);
        int netIncome = incomeConvertion - staffExpenseConvertion - otherExpenseConvertion;
        System.out.println("Net income: " + netIncome);

    }
}