package com.bridgelab.com;

import java.util.Scanner;

public class UserRegisteration {
	
	
	public static boolean firstNameValidation(String FirstName)
	{
		return FirstName.matches("^?[A-Z][a-z]{1,3}$");
	}
    public static boolean lastNameValidation(String LastName)
 	{
 		return LastName.matches("^?[A-Z][a-z]{1,3}$");
 	}
    public static boolean emailValidation(String Email)
    {
    	 return Email.matches("^(?=.{1,64}@)[\\p{L}0-9_-]+(\\.[\\p{L}0-9_-]+)*@$"+ "[^-][\\p{L}0-9-]+(\\.[\\p{L}0-9-]+)*(\\.[\\p{L}]{2,})$");
    }
    public static boolean phonenumberValidation(String Number)
    {
    	 return Number.matches("(0|91)?[7-9][0-9]{9}");
    }
    public static boolean passwordValidation1(String Password1)
    {
    	return Password1.matches("^*[A-Za-z0-9]{8}"); //at least 8 char
    }
    public static boolean passwordValidation2(String Password2)
    {
    	return Password2.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8}$"); // at least one number and 8 char
    }
    public static boolean passwordValidation3(String Password3)
    {
    	return Password3.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$^&]).{8}$");
    }   // at least one number and one special char
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First Name");
		String FirstName = sc.next();
		System.out.println("Enter Your Last Name");
		String LastName = sc.next();
        System.out.println("Enter Email ID");
        String Email = sc.next();
        System.out.println("Enter Phone Number");
        String Number = sc.next();
        System.out.println("Enter Your Password");
        String Password1 = sc.next();
        System.out.println("Enter Your Password");
        String Password2 = sc.next();
        System.out.println("Enter Your Password");
        String Password3 = sc.next();
		System.out.println(firstNameValidation(FirstName));
		System.out.println(firstNameValidation(LastName));
		System.out.println(emailValidation(Email));
		System.out.println(phonenumberValidation(Number)); 
		System.out.println(passwordValidation1(Password1));
		System.out.println(passwordValidation2(Password2));
		System.out.println(passwordValidation3(Password3));
	}
}
