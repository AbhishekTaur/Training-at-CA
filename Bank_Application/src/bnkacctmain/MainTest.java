package bnkacctmain;

import bnkacct.*;
import bnkacctexcept.*;
public class MainTest {
	
	public static void main(String[] args){
		
		try{
		BankAccountClass bac1 = new BankAccountClass(123,"Zazzy",200.0);
		bac1.display();
		}
		
		
		catch(CreateAccountException cae){
			cae.showMessage();
		}
		
		try{
			BankAccountClass bac2 = new BankAccountClass(101,"Pooh",1800);
			bac2.display();
			bac2.withdrawMoney(1300);
		}
		
		catch(CreateAccountException ex1){
			ex1.showMessage();
		}
		
		catch(InsufficientBalanceException ex2){
			ex2.showMessage();
		}
	}
}
