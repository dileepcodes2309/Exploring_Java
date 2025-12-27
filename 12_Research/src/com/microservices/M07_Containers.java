package com.microservices;

public class M07_Containers {
    public static void main(String[] args) {

        String containers = """
                -> A container is a lightweight, loosely isolated environment
                -> It allows us to build and run applications reliably.
                -> A container includes:Runtime,Libraries,Dependencies.
                -> These packaged units are called container images.
                """;

        String softwareContainerization = """
                -> Software containerization is an OS-level virtualization technique.
                -> It allows applications to run without using a Virtual Machine (VM).
                -> Containers can run on physical machines, virtual machines, in the cloud,
                   and across multiple operating systems.
                """;

        String docker = """
                -> Docker is an open-source platform used for containerization.
                -> It helps developers:Build applications,Package them into containers,
                   Deploy and manage them easily.
                -> It helps developers:Build applications,Package them into containers,
                   Deploy and manage them easily.
                -> Each container includes:Application,Dependencies,Libraries and Runtime components
                """;
    }
}
