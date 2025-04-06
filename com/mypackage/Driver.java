package com.mypackage;
import enums.DriverStatus;

public class Driver {
    public int employeeid;
    public int userId;
    public String make;
    public String model;
    public String licensePlate;
    public DriverStatus status;

    public Driver(   
        int employeeid,    
        int userId,
        String make,
        String model,
        String licensePlate,
        DriverStatus status
    ) { 
        this.employeeid = employeeid;
        this.userId = userId;
        this.make = make;
        this.model = model;
        this.licensePlate = licensePlate;
        this.status = status;
    } 
}