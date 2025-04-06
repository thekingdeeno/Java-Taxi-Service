package services;
import java.util.Scanner;

import com.mypackage.Driver;

import enums.DriverStatus;
import repositories.DriverService;

public class RegisterVehicle {
    static Scanner input = new Scanner(System.in);
    public static void main(int userId){

        String make;
        String model;
        String licensePlate;

        System.out.println("VEHICLE REGISTRATION PROCESS STARTED!!!");

        System.out.println("Please specify the manufacturer of your car");
        make = input.nextLine();

        System.out.println("What is the model of the car?");
        model = input.nextLine();

        System.out.println("Enter the liscense plate number of the vehicle");
        licensePlate = input.nextLine();

        int currSize = DriverService.fetchSize();

        Driver newDriver = new Driver(currSize + 1, userId, make, model, licensePlate, DriverStatus.ACTIVE);

        DriverService.addDriver(newDriver);

        System.out.println("New Driver Registered Successfully");
    };
};
