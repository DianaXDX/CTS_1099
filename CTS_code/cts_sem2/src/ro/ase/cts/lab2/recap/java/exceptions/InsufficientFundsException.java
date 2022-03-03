package ro.ase.cts.lab2.recap.java.exceptions;

public class InsufficientFundsException extends Exception{

	public InsufficientFundsException(String msg) {
		super(msg);
	}
	
	public InsufficientFundsException() {
		super();
	}
}
