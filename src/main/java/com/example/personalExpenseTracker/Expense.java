public class Expense {
    private double amount;
    private String category;
    private LocalDate date;
    private String description;
    
    public Expense(double amount, String category, LocalDate date, String description) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (category == null ) {
            throw new NullPointerException("Category cannot be null");
        }
        if (date == null) {
            throw new NullPointerException("Date cannot be null");
        }
        if (description == null) {
            throw new NullPointerException("Description cannot be null");
        }
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

}
