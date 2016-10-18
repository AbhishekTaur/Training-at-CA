package bnkacctexcept;

public class InsufficientBalanceException extends Exception{
	
	private double bankBalance;
	private double withdrawAmount;
	
//	public float getBankBalance() {
//		return bankBalance;
//	}
//
//	public void setBankBalance(float bankBalance) {
//		this.bankBalance = bankBalance;
//	}

	public InsufficientBalanceException(double bb, double wa){
		bankBalance = bb;
		withdrawAmount = wa;
	}
	
	public void showMessage(){
		System.out.println(bankBalance + " will be less than 1000 if this transaction occurs. Not allowed.");
	}
}
