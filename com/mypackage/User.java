package com.mypackage;
import java.time.LocalDate;
import enums.AccountType;

public class User {
    public int id;
    public String fullName;
    public String gender;
    public String email;
    public LocalDate regDate;
    public String homeTelNo;
    public String mobileTelNo;
    public String address;
    public AccountType accountType;


    public User(       
        int id,
        String fullName,
        String gender,
        String email,
        LocalDate regDate,
        String homeTelNo,
        String mobileTelNo,
        String address,
        AccountType accountType
    ) { 
        this.id = id;
        this.fullName = fullName;
        this.gender = gender; 
        this.email = email; 
        this.regDate = regDate; 
        this.homeTelNo = homeTelNo;
        this.mobileTelNo = mobileTelNo;
        this.address = address;
        this.accountType = accountType;
    } 
}
