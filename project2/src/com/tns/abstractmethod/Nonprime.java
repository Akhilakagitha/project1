package com.tns.abstractmethod;

public class Nonprime  implements Accounts{
	int amt;
	
	 public Nonprime() {
		 super();
	 }
	 public Nonprime(int amt) {
		 super();
		 this.amt = amt;
	 }
	 public int getAmt() {
		 return amt;
	 }
	 public void setAmt(int amt) {
		 this.amt = amt;
		 }
	 
	 public void delivarycharges(int amy) {
		 //TODO Auto-generated method stub
		 System.out.println("the amount is"+amt);
		 
	 }
	@Override
	public void deliverycharges(int amt) {
		// TODO Auto-generated method stub
		
	}
	 
}
	 
	 


