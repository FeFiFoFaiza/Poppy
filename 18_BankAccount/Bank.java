/*
TPNG: Nachos | Faiza Huda, Gabriel Thompson, Iggy, Jacob Ng, PreGuac, Truthful $
APCS
HW 18 -- CPA-One
2021-10-14
 
  This is being used to make a new instance of BankAccount class and tests constructors and methods.
*/

public class Bank {
	public static void main( String[] args ) {
		BankAccount account = new BankAccount( "221202484", "nachos", "12345", "0000" );
		account.printInfo();
		System.out.println();
		
		account.deposit(432873.0);
		account.printInfo();
		System.out.println();
		
		account.withdraw(34732.5323);
		account.printInfo();
		System.out.println();
	}
}
