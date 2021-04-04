package application;

import java.util.Scanner;

import entities.Account;
import exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.println("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try {
			acc.withdraw(amount);
			System.out.println("New balance: " + acc.getBalance());
		}
		catch (DomainException excp) {
			System.out.println("Withdraw error: " + excp.getMessage());
		}
	
		
		sc.close();

	}

}