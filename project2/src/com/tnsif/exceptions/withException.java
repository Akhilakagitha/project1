package com.tnsif.exceptions;

public class withException {
	public static void divide() {
		int a=6,b=0,c;
		try { //exception is raised
			c=a/b;
		}
		 catch(ArithmeticException e) { 
			 System.out.println("Exception Caught"+e.getMessage());
		 }
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception Caught "+e.getMessage());
			}
		catch(Exception e) {
			System.out.println("Exception Caught"+e.getMessage());
		}
		finally {
			System.out.println("this will be executed");
		}
		}
}
	


