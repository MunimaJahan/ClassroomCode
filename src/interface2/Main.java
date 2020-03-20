package interface2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		BankAccount[] accounts = new BankAccount[3];
		accounts[0] = new BankAccount(10000);
		accounts[1] = new BankAccount(0);
		accounts[2] = new BankAccount(2000);
		Arrays.sort(accounts);
		System.out.println(accounts[0].compareTo(accounts[1]));
		for(BankAccount ba:accounts)
			System.out.println(ba.getBalance());
	}
	

}
