package interface2;
import java.util.*;

public class BankAccount implements Comparable{
	double balance;
	public BankAccount(double b) {
		balance=b;
	}
	public double getBalance() {
		return balance;
	}
	public int compareTo(Object otherObject)
	{
		BankAccount other =  (BankAccount)otherObject;
		if (balance < other.balance) { return -1; }
		if (balance > other.balance) { return 1; }
		return 0;
	}

}
