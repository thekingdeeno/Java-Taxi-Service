package com.mypackage;
import enums.OrderStatus;

public class Order {
    public int orderId;
    public int userId;
    public String pickup;
    public String destination;
    public int fare;
    public OrderStatus orderStatus;
    public int driverId; // this is the drivers employee id NOT user id

    public Order(
        int orderId,
        int userId,
        String pickup,
        String destination,
        int fare,
        OrderStatus orderStatus,
        int driverId
    ){
        this.orderId = orderId;
        this.userId = userId;
        this.pickup = pickup;
        this.destination = destination;
        this.fare = fare;
        this.orderStatus = orderStatus;
        this.driverId = driverId;
    }
}
