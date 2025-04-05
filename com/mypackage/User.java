package com.mypackage;
import java.time.LocalDate;

public class User {
    public int customerId;
    public String fullName;
    public String gender;
    public String email;
    public LocalDate regDate;
    public String homeTelNo;
    public String mobileTelNo;
    public String address;
    public AccountType accountType;


    public User(       
        int customerId,
        String fullName,
        String gender,
        String email,
        LocalDate regDate,
        String homeTelNo,
        String mobileTelNo,
        String address
    ) { 
        this.customerId = customerId;
        this.fullName = fullName;
        this.gender = gender; 
        this.email = email; 
        this.regDate = regDate; 
        this.homeTelNo = homeTelNo;
        this.mobileTelNo = mobileTelNo;
        this.address = address;
    } 
}
