package com.conceptual;

public class J18_Student {

    private int age;

    private J18_Address address;

    public J18_Student(int age, J18_Address address) {
        this.age = age;
        this.address = address;
    }

    public J18_Student(J18_Student copy) {
        this.age = copy.age;
        this.address = copy.address;
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
    public String toString() {
        return "J18_Student{" +
                "age=" + age +
                ", address=" + address +
                '}';
    }
}
