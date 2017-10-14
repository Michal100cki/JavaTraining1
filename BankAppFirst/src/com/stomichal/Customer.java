package com.stomichal;

public class Customer {
    private String name;
    private double wplaty;

    public Customer(String name, double transaction) {
        this.name = name;
        this.wplaty=transaction;
        System.out.println(name+" "+transaction+" "+this.wplaty);
    }

    public String getName() {
        return name;
    }


    public Double getWplaty() {
        return wplaty;
    }

    public static Customer createCustomer(String name, Double transaction) {
        System.out.println(name+" "+transaction);
        return new Customer(name,transaction);

    }





}
