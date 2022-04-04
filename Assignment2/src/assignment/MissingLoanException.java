package assignment;

public class MissingLoanException extends Exception{
    public MissingLoanException(double loan) {
        super("Loan value is smaller than 0:" + loan);
    }
}
