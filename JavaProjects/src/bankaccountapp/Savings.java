package bankaccountapp;

public class Savings extends Account {
	// List properties to saving accounts
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	
	// Constructor to initialize checking saving properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		acccountNumber = "1" + acccountNumber;
		setSafetyDepositBox();

	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;		
	}

	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	// List any methods specific to the saving accounts
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"Your Savigs Account Features" +
				"\n Safety Deposit Box ID: " + safetyDepositBoxID +
				"\n Safety Deposit Box Key: " + safetyDepositBoxKey
				);
	}


}
