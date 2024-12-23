public class Report {
    private ExpenseManager expenseManager;

    public Report(ExpenseMananager expenseManager) {
        this.expenseManager = expenseManager;
    }

    public void generateExpensesByCategory() {
        //generate and print a report of expenses by type
    }

    public void generateMonthlyReport() {
        //generate and print a report for expenses in the current month
    }

    public void generateBudgetComparison() {
        //compare actual expenses with budgeted amounts
    }
}
