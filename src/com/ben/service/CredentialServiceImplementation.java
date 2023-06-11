package com.ben.service;

import java.util.Random;

import com.ben.EmailImpl.Employee;

public class CredentialServiceImplementation implements CredentialService {
	public static final int passwordLength = 8;
	public static final String COMPDOM_STRING = ".ben.com"; 
        public String generatePassword() {

        String capString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = capString.toLowerCase();
        String num = "0123456789";
        String splchar = "!@#$%^&*~()";

        String finalCase = capString + lowerCase + num + splchar;
        String filter = "";

        Random random = new Random();

        for(int i=0;i<passwordLength;i++){
            filter = filter + finalCase.charAt(random.nextInt(finalCase.length()));
        }
        return filter;
    }

    public String generateEmailAddress(Employee employee) {
        String firstName = employee.getFirstName().toLowerCase();
        String lastName = employee.getLastName().toLowerCase();
        String department = employee.getDepartment();

        return firstName + lastName + "@"+ department + COMPDOM_STRING;
    }

    public String showDetail(Employee employee) {
    	
        System.out.println("Dear "+employee.getFirstName()+
        		" your generated credentials are as follows");
        System.out.println("Email --> "+employee.getEmail());
        System.out.println("Password --> "+employee.getPassword());
        
        return null;
    }
}
