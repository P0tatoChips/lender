public class Loan {
    private int amount;
    private String borrower;
    private boolean isPaid;
    private double interestRates;
    private String contactNumber;

    public Loan(int amount, String borrower, double interestRate, String contactNumber) {
        this.amount = amount;
        this.borrower = borrower;
        this.interestRates = interestRate;
        this.contactNumber = contactNumber;
        this.isPaid = false;
    }

    public int getAmount() {
        return amount;
    }

    public String getBorrower() {
        return borrower;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public double getInterestRates() {
        return interestRates;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setPaid(boolean b) {
        this.isPaid = isPaid;
    }
}
