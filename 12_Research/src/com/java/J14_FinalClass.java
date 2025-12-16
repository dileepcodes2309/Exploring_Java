package com.java;

import java.util.Date;

public final class J14_FinalClass {

    private final String name;
    public final Date dob; //mutable object

    public J14_FinalClass(String name,Date dob){
        this.name = name;
        this.dob = new Date(dob.getTime()); //defensive copy
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return new Date(dob.getTime()); // return copy
    }
}
