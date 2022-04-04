package assignment;

public class Loan {
    private double loanValue, rate;

    public Loan(double loanValue, double rate) {
        this.loanValue = loanValue;
        this.rate = rate;
    }

    public void setLoanValue(double value) throws Exception {
        try {
            if (value < 0)
                throw new MissingLoanException(loanValue);
            else {
                loanValue = value;
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getLoanValue() {
        return loanValue;
    }

    public double getRate() {
        return rate;
    }

    public double getMonthlyRate() {
        return loanValue * rate;
    }
}
