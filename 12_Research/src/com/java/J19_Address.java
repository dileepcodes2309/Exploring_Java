package com.java;

public class J19_Address implements Cloneable{

    private String street;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public J19_Address(String street) {
        this.street = street;
    }

    @Override
    public J19_Address clone(){
        try {
            return (J19_Address) super.clone(); // Shallow copy, fine for primitives & Strings
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Should never happen
        }
    }

    @Override
    public String toString() {
        return "J19_Address{" +
                "street='" + street + '\'' +
                '}';
    }
}
