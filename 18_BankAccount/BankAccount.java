/*
TPNG: Nachos | Faiza Huda, Gabriel Thompson, Iggy, Jacob Ng, PreGuac, Truthful Tom
APCS
HW 18 -- CPA-One
2021-10-14
*/

public class BankAccount {
	private String accHolderName;
	private String accPassword;
	private double balance;
	private String pin;
	private String accID;
	
	public BankAccount() {
		accHolderName = "";
		accPassword = "";
		balance = 0.0;
		pin = "";
		accID = "";
	}
	
	public BankAccount( String id, String name, String pwd, String pinNum ) {
		accHolderName = name;
		accPassword = pwd;
		accID = id;
		pin = pinNum;
	}
	
	public void printInfo() {
		System.out.println("Account holder name: " + accHolderName);
                System.out.println("Account password: " + accPassword);
                System.out.println("Account balance: " + balance);
                System.out.println("PIN number: " + pin);
                System.out.println("Account ID: " + accID);
	}
	
	public void deposit( double amount ) {
		balance += Math.round(amount * 100.0) / 100.0;
	}
	
	public void withdraw( double amount ) {
		balance -= Math.round(amount * 100.0) / 100.0;
	}
}
