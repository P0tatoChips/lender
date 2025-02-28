
public class Main {
    static int[] amounts = new int[100];
    static String[] borrowers = new String[100];
    static boolean[] isPaid = new boolean[100];
    static double[] interestRates = new double[100];
    static int loansCount = 0;


    public static void addLoan(String borrower, int amount, double interestRate) {
        borrowers[loansCount] = borrower;
        amounts[loansCount] = amount;
        interestRates[loansCount] = interestRate;
        loansCount++;
    }

    public static void setAsPaid(String borrower) {
        for (int i = 0; i < loansCount; i++) {
            if (loans[i].getBorrower().equals(borrower)) {
                loans[i].setPaid(true);
            }
        }
    }

    public static void listLoans() {
        for (int i = 0; i < loansCount; i++) {
            if (!loans[i].isPaid) {
                System.out.println(loans[i].getBorrower() + ": " + loans[i].getAmount());
            }
        }
    }

    public static double calculateProfitEarned() {
        double profit = 0;
        for (int i = 0; i < loansCount; i++) {
            // if the loan was repaid, add the interest to profit
            if (loans[i].isPaid) {
                profit = profit + (loans[i].getAmount() * loans[i].getinterestRates[i]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        addLoan("Alice Betsy", 10, 0.1);
        addLoan("Ben Chee", 20, 0.2);
        addLoan("Chris Davis", 30, 0.3);
        setAsPaid("Ben Chee");
        listLoans();
        System.out.println("profit: " + calculateProfitEarned());
    }
}
