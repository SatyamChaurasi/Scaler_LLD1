package day_117;

public class Q6_Create_BankAccount_class {
//	Additional Problem -> Q1. Create BankAccount class
//	It should have 3 data members
//	accountNumber: String
//	balance: int
//	roi:double (Should represent rate of interest)
//	It should have 2 methods
//	getSimpleInterest: It should take time (in years) as a parameter. 
//	The data type of time should be int. It should return Simple Interest as a double.
//	getBalanceWithInterest: It should take time (in years) as a parameter. 
//	The data type of time should be int. It should return a new balance (including simple interest) as a double.
	
	public static void main(String args[]) {
		BankAccount bA = new BankAccount("IOB1234",10,2.9);
		System.out.println("Simple Interest "+bA.getSimpleInterest(2));
		System.out.println("Balance With Interest "+bA.getBalanceWithInterest(2));
	}

}
class BankAccount{
	String accountNumber;
	int balance;
	double roi;
	
	public BankAccount() {
		this.accountNumber = "";
		this.balance = 0;
		this.roi =0.0;
	}
	
	public BankAccount(String accountNumber,int balance,double roi) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.roi = roi;
	}
	
	public double getSimpleInterest(int time) {
		return ((balance * roi* time)/100); 
	}
	
	public double getBalanceWithInterest(int time) {
		return balance + getSimpleInterest(time);
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getRoi() {
		return roi;
	}

	public void setRoi(double roi) {
		this.roi = roi;
	}
	
}
