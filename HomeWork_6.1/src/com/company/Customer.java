package com.company;

import java.util.UUID;

public class Customer extends User implements Comparable<Customer> {
    public UUID id = UUID.randomUUID();
    public String phoneNumber;
    public String fullName;

    public Customer(String fullName, String login, String password, String phoneNumber) {
        super(password, login);
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
    }

    @Override
    public int compareTo(Customer o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Customer{id=" + this.id + "; phoneNumber='" + this.phoneNumber + "'; fullName='" + this.fullName + "'; login='" + this.login + "'}";
    }
}
