package bnkacct;

import bnkacctexcept.*;

public class BankAccountClass {
	private int accountNumber;
	private double bankBalance;
	private String holderName;
	private double tt;
	
	public BankAccountClass (int accno, String name, double bb) throws CreateAccountException {
		accountNumber = accno;
		holderName = name;
		bankBalance = bb;
		
		if(bankBalance < 1000)
			throw  new CreateAccountException(bankBalance)  ;
	}
	
	
	public void withdrawMoney (float wa) throws InsufficientBalanceException{
		tt = bankBalance - wa;
		if(tt<1000)
			throw  new InsufficientBalanceException(bankBalance,wa);
		bankBalance = bankBalance - wa;
	}
	
	public void display(){
		System.out.println("The name of holder is " +holderName);
		System.out.println("The bank balance is " +bankBalance);
		System.out.println("The account number is "+accountNumber);
	}
	
}
