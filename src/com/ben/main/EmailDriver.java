package com.ben.main;

import com.ben.EmailImpl.Employee;
import com.ben.service.CredentialService;
import com.ben.service.CredentialServiceImplementation;

import java.util.Scanner;

public class EmailDriver {
    public static void main(String[] args) {

        CredentialService service = new CredentialServiceImplementation();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter first name ");
        String fname = scan1.nextLine();
        
        System.out.println("Enter last name ");
        String lname = scan1.nextLine();

        Employee employee = new Employee(fname,lname);

        System.out.println("Please enter the Department from the following ");
        System.out.println("1. Technical ");
        System.out.println("2. Admin ");
        System.out.println("3. Human Resource ");
        System.out.println("4. Legal ");

        int option = scan1.nextInt();

        switch (option){
            case 1: employee.setDepartment("tech");
                    break;
            case 2:employee.setDepartment("admin");
                    break;
            case 3:employee.setDepartment("hr");
                    break;
            case 4:employee.setDepartment("legal");
                    break;
            default:
                System.out.println("Please enter valid choice");
                break;
        }

        if(employee.getDepartment()!=null){
        	
            employee.getDepartment();
            
            String email = service.generateEmailAddress(employee);
            employee.setEmail(email);
            
            String password = service.generatePassword();
            employee.setPassword(password);
            
            service.showDetail(employee);
        }
        scan1.close();
    }
}
