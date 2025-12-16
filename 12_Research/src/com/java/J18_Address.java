package com.java;

public class J18_Address {

    private String street;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public J18_Address(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "J18_Address{" +
                "street='" + street + '\'' +
                '}';
    }
}
