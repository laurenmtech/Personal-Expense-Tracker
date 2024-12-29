import java.util.ArrayList;

public class ExpenseManager {
    private List<Expense> expenses;

    public ExpenseManager() {
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void removeExpense(Expense expense) {
        expenses.remove(expense);
    }

    public double getTotalExpenses() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }

    public List<Expense> getExpensesByCategory(String category) {
        List<Expense> byCategory = new ArrayList<>();
        for (Expense expense : expenses) {
            if (expense.getCategory().equals(category)) {
                byCategory.add(expense);
            }
        }
    }
    
    public List<Expense> getExpensesByDate(String date) {
        List<Expense> byDate = new ArrayList<>();
        for (Expense expense : expenses) {
            if (expense.getDate().equals(date)) {
                byDate.add(expense);
            }
        }
    }
}
