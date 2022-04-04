package assignment;

public class Account {
    private Loan loan;
    private AccountType accountType;
    private int daysActive;

    public Account(double loanValue, double rate, AccountType accountType, int daysActive) {
        try {
            this.loan.setLoanValue(loanValue);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.loan.setRate(rate);
        this.accountType = accountType;
        this.daysActive = daysActive;
    }

    public double getInterest(Account account) {
        int daysInAYear= 365;
        return accountType != AccountType.PREMIUM || accountType != AccountType.SUPER_PREMIUM ? account.loan.getLoanValue() * (Math.pow(account.loan.getRate(), (account.daysActive / daysInAYear)) - 1) : 0;
    }

    public static double calculateTotalFee(Account account) {
        double totalFee = 0.0;
        double brokerFee = .0125;
                totalFee += brokerFee * account.getInterest(account);
        return totalFee;
    }
}
