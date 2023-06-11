package com.ben.service;

import com.ben.EmailImpl.Employee;

public interface CredentialService {

    public  String generatePassword();
    public String generateEmailAddress(Employee employee);

    public String showDetail(Employee employee);




}
