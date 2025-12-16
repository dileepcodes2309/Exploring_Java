package com.java;

public class J19_Student implements Cloneable{

    private int age;

    private J18_Address address;

    public J19_Student(int age, J18_Address address) {
        this.age = age;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public J18_Address getAddress() {
        return address;
    }

    public void setAddress(J18_Address address) {
        this.address = address;
    }

    @Override
    public J19_Student clone() {
        try {
            J19_Student cloned = (J19_Student) super.clone();
            //cloned.address = address.clone(); // deep copy
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "J19_Student{" +
                "age=" + age +
                ", address=" + address +
                '}';
    }
}
