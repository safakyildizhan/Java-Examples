package bankaccountapp;

public class Checking extends Account {
	// List properties to checking accounts
	private int debitCardNumber;
	private int debitCardPIN;
	
	// Constructor to initialize checking account properties
	
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		acccountNumber = "2" + acccountNumber;
		setDebitCard();

	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	// List any methods specific to the checking accounts
	public void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"Your Checking Account Features" +
				"\n Debit Card Number: " + debitCardNumber +
				"\n Debit Card PIN: " + debitCardPIN
				);
	}

}
