package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {

	
	public static void main(String[] args) {
		//String patternname ="[a-zA-Z]{3,}";
	    //String patternname = "^[A-Z][a-zA-Z]{3,}(?: [A-Z][a-zA-Z]*){0,2}$";
		
		String patternname = "^[A-Z][a-zA-Z]{3}[a-z]{2,}$";
		Pattern regex = Pattern.compile(patternname);
		Scanner scanner = new Scanner(System.in);
		System.out.print("First name starts with Cap and minimum 3 characters : ");
	    String Firstname = scanner.nextLine();
	    Matcher firstNameMatcher = regex.matcher(Firstname);
	    if (firstNameMatcher.matches()) {
	            System.out.println(Firstname + " is valid First name.");
	    } else {
	            System.out.println(Firstname + " is invalid First name");
	    }
		
        System.out.println("*******************************");	    
	    String patternname1 = "^[a-z][a-zA-Z]{2,}[A-Z]{3}$";
        Pattern regex1 = Pattern.compile(patternname1);
     
        System.out.print("Last name starts with Cap and  minimum 3 characters: ");
        String lastnameStr = scanner.nextLine();
        Matcher lastNameMatches = regex1.matcher(lastnameStr);
       
        if (lastNameMatches.matches()) {
            System.out.println(lastnameStr + " is valid Last Name");
        } else {
            System.out.println(lastnameStr + " is invalid Last Name ");
        }
        
        System.out.println("*********************************");
        
        String emailId =  "^([a-z]{3}[-.])([a-z]+)*@([a-z]{2}[-.])([a-z]{2}[-.])([a-z]+)*$";
		
        Pattern regex11 = Pattern.compile(emailId);
      
        System.out.print("Enter the mailid: Ex abc.xzy@bl.co.in ");
        String valimail = scanner.nextLine();
        Matcher emailMatches = regex11.matcher(valimail);
       
        if (emailMatches.matches()) {
            System.out.println(valimail + " is valid emailid");
        } else {
            System.out.println(valimail + " is invalid emailid ");
        }
        
        System.out.println("*******************************");
        
        String Phnonumbervalidation =  "^([0-9]{2}[- ])[0-9]{10}$";
		
        Pattern regex4 = Pattern.compile(Phnonumbervalidation);
  
        
        System.out.print("Enter phone number: EX 91 1234567895");
        String ValidPhonNumber1 = scanner.nextLine();
        Matcher phnoeMatches = regex4.matcher(ValidPhonNumber1);
       
        if (phnoeMatches.matches()) {
            System.out.println(ValidPhonNumber1 + " is valid phone number");
        } else {
            System.out.println(ValidPhonNumber1 + " is invalid phone number ");
        }
        
        
        System.out.println("*****************************");
        String predefinedpassword =  "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8}$";
		
        Pattern regex5 = Pattern.compile(predefinedpassword);
        
        System.out.print("Enter predifinedword 8 character all rules must be passed ");
        String validpredefinedpassword = scanner.nextLine();
        Matcher emailMatches1 = regex5.matcher(validpredefinedpassword);
       
        if (emailMatches1.matches()) {
            System.out.println(validpredefinedpassword + " is valid password");
        } else {
            System.out.println(validpredefinedpassword + " is invalid password ");
        }
        System.out.println("**************************");
        

		String oneuppercasevalidation = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]){1}(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{0,}$";
		
		Pattern regex6 = Pattern.compile(oneuppercasevalidation);
     
        System.out.print("Enter password one uppercase all rules must be passed ");
        String validpassword = scanner.nextLine();
        Matcher uppercase = regex6.matcher(validpassword);
       
        if (uppercase.matches()) {
            System.out.println(validpassword + " is valid password");
        } else {
            System.out.println(validpassword + " is invalid password ");
        }
        
        
        System.out.println("************************");
        String numricnumber = "^(?=.*[0-9]){1}(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{0,}$";
		
		Pattern regex7 = Pattern.compile(numricnumber);

        System.out.print("Enter password one numric number all rules must be passed ");
        String validpasswordnumric = scanner.nextLine();
        Matcher numric = regex7.matcher(validpasswordnumric);
       
        if (numric.matches()) {
            System.out.println(validpasswordnumric + " is valid password");
        } else {
            System.out.println(validpasswordnumric + " is invalid password ");
        }

         System.out.println("*****************************");
        String specialcharactervalidation = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]){1}.{0,}$";
		
		Pattern regex8 = Pattern.compile(specialcharactervalidation);
     
        System.out.print("Enter password one special character all rules must be passed ");
        String validpasswordcharacter = scanner.nextLine();
        Matcher specialcharacter = regex.matcher(validpasswordcharacter);
       
        if (specialcharacter.matches()) {
            System.out.println(validpasswordcharacter + " is valid password");
        } else {
            System.out.println(validpasswordcharacter + " is invalid password ");
        }
       
        
        System.out.println("all sample emails UC 9");
     // all Sample Emails to Test
		
		//1st one	
		String sampleemailtest =  "^([a-z]){3}@([a-z]{5}[-.])([a-z]{3}[-,])*$";
		 
		//2nd  is done
		String sampleemailtest =  "^([a-z]){3}([-])([0-9]){3}@([a-z]{5}[-.])([a-z]{3}[-,])*$";
		
		//3rd is done
		String sampleemailtest =  "^([a-z]){3}([-.])([0-9]){3}@([a-z]{5}[-.])([a-z]{3}[-,])*$";
		
		//4th one
		
		 String sampleemailtest =  "^([a-z]){3}([0-9]){3}@([a-z]{3}[-.])([a-z]{3}[-,])*$";
		
		//5th one
		
		String sampleemailtest =  "^([a-z]){3}([-.])([0-9]){3}@([a-z]{3}[-.])([a-z]{2}[-,])*$";
		
		// 6th one
		
		String sampleemailtest =  "^([a-z]){3}([-.])([0-9]){3}@([a-z]{3}[-.])([a-z]{3})*$";
		
		// 7th one
		
		String sampleemailtest =  "^([a-z]){3}@([0-9]){1}([-.])([a-z]{3}[-,])*$";
		
		//8th one
		
		String sampleemailtest =  "^([a-z]){3}([+])([0-9]){1}([-.])([a-z]{3})*$";
		
		Pattern regex = Pattern.compile(sampleemailtest);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email: ");
        String Validemail = scanner.nextLine();
        Matcher emailMatches = regex.matcher(Validemail);
       
        if (emailMatches.matches()) {
            System.out.println(Validemail + " is valid password");
        } else {
            System.out.println(Validemail + " is invalid password ");
        }
        
      }
       
    }
	       
	

