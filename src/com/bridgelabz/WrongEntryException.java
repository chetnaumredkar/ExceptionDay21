package com.bridgelabz;

import java.util.regex.Pattern;

public class WrongEntryException extends Exception {
	WrongEntryException(String message){
		super(message);
		
	}

}
class UserEntryDetails1   {
	public static void checkValidfirstname(String fName) {
		boolean result=Pattern.matches(("[A-Z][a-z]{3,}"),fName);
		try {
			if(result==false) {
				throw new WrongEntryException("Wrong eNTRY");
			}
			else {
				System.out.println("continue");
			}
			}
			catch(WrongEntryException w) {
				w.printStackTrace();
			}
			System.out.println("Exception not required ");

	}
	public static void checkValidphonenumber(String phoneNumber) {
	boolean result=Pattern.matches(("[1-9]{2}\s[0-9]{10}"),phoneNumber);
	try {
	if(result==false) {
		throw new WrongEntryException("Wrong eNTRY");
	}
	else {
		System.out.println("continue");
	}
	}
	catch(WrongEntryException w) {
		w.printStackTrace();
	}
	System.out.println("Exception not required");

}
	public static void main(String[] args) {
		//checkValidphonenumber("12768728");
		
		checkValidfirstname("Finny");
	}
	}
