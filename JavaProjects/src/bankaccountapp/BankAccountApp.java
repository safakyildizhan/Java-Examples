package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();

		
		
		
		String file = "C:\\Users\\safak\\eclipse-workspace\\JavaProjects\\NewBankAccounts.csv";
		
		
		// Read a CSV file then create new accounts based on that data
		
		
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			// System.out.println("New Account");
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			
			// System.out.println(name + " " + sSN + " " + accountType + " " + initDeposit);
			if (accountType.equals("Savings")) {
				// System.out.println("Open a Savings Account");
				accounts.add(new Savings(name, sSN, initDeposit));
			}
			else if (accountType.equals("Checking")) {
				// System.out.println("Open a Checking Account");
				accounts.add(new Checking(name, sSN, initDeposit));
			}
			else {
				System.out.println("Error Reading Account Type");
			}

		}
		
		
		for (Account acc : accounts) {
			System.out.println("\n********************\n");
			acc.showInfo();

			
		}
		
		
		
		/*
		Checking chkacc1 = new Checking("Tom Wilson", "12345678",1500);
		
		Savings savacc1 = new Savings("Rich Lowe","87654321",2500);
		
		savacc1.showInfo();
		System.out.println("\n***********************************\n");
		chkacc1.showInfo();
		
		savacc1.compound();
		*/		
		

	}

}
