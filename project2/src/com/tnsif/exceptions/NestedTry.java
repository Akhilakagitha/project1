package com.tnsif.exceptions;
//program to demonstrate nested try block
public class NestedTry {
	public static void check() {
	String str="tns";
	int slenght=str.length();
	System.out.println("the lenght is"+ slenght);//exception arises
	String anotherString="hello";
	int y=6;
	try {//outer try
		int z=y/0;//exception occured
		try {//inner try
			System.out.println(str.charAt(y));//exception arises
		}
		catch(StringIndexOutOfBoundsException ex) {//inner catch
			System.out.println("Arithmetic exception"+ex.getMessage());
		}
	}
		catch(ArithmeticException ex) {//inner catch
			System.out.println("Arithmetic exception" +ex.getMessage());
		}
	}
}


