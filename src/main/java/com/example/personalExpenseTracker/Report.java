public class Report {
    private ExpenseManager expenseManager;

    public Report(ExpenseMananager expenseManager) {
        this.expenseManager = expenseManager;
    }

    public void generateExpensesByCategory() {
        for (Expense expense: expenses) {
            System.out.println(expense.getCategory());
        }
    }

    public void generateMonthlyReport() {
        for(Expense expense: expenses) {
            System.out.println(expense.getDate());
        }
    }

    public void generateBudgetComparison() {
        //compare actual expenses with budgeted amounts
    }
}
