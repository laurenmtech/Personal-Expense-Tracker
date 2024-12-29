package com.example.personalexpensetracker;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Personal Expense Tracker!");

        Scanner scanner = new Scanner(System.in);
        ExpenseManager expenseManager = new ExpenseManager();
        System.out.println("please choose from the following options");

        while(true) {
            System.out.println("Add Expense (press 1)");
            System.out.println("Remove Expense (press 2)");
            System.out.println("Generate Report (press 3)");
            System.out.println("Exit (press 4)");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    expenseManager.addExpense();
                    break;
                case 2:
                    expenseManager.removeExpense();
                    break;
                case 3:
                    expenseManager.generateMonthlyReport();
                    break;
                case 4:
                    System.out.println("You're a budgeting master! Exiting...");
                    return;
            }
        }
    }
} 