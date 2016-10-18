package bnkacctexcept;

public class CreateAccountException extends Exception {
	
	private double bankBalance;
	
//	public float getBankBalance() {
//		return bankBalance;
//	}
//
//	public void setBankBalance(float bankBalance) {
//		this.bankBalance = bankBalance;
//	}

	public CreateAccountException(double bankBalance){
		this.bankBalance = bankBalance;
	}

	public void showMessage(){
		System.out.println(bankBalance + " is less than 1000. Bank account cant be created\n");
	}
}
