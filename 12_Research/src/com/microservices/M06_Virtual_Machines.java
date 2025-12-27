package com.microservices;

public class M06_Virtual_Machines {
    public static void main(String[] args) {

        String definition = """
                -> A virtual machine is a software based computer that runs on a physical
                   machine.
                -> A physical machine can have multiple virtual machines.
                -> VMs are fully isolated from each other.
                -> The hypervisor shares physical hardware resources among VMs.
                """;

        String analogy = """
                🏢 Apartment Building
                
                Building = Physical machine
                Apartments = Virtual Machines
                Each apartment:
                Has its own family (OS + Apps)
                Uses shared electricity/water (CPU/RAM)
                Families don’t interfere with each other
                👉 That’s isolation
                """;
    }
}
