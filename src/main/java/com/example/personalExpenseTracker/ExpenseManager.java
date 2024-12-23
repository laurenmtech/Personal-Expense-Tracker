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
        return expenses.stream().mapToDouble(Expense::getAmount).sum();    
    }

    public List<Expense> getExpensesByCategory(String category) {
        //return expenses that match the category
    }
    
    public List<Expense> getExpensesByDate(String date) {
        //return expenses that match the date
    }
}
