package ro.ase.cts.lab2.recap.java.models;

public abstract class Account {
	public abstract void deposit(double amount);
	public abstract void widthdraw(double amount);
	public abstract void transfer(Account destination, double amount);
	public abstract double getBalance();
}
