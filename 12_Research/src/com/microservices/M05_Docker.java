package com.microservices;

public class M05_Docker {
    public static void main(String[] args) {

        //challenges in microservices
        String challenges = """
                When working with hundreds of microservices, teams face challenges in:
                -> Deploying services efficiently
                -> Moving services across environments
                -> Scaling services based on demand
                """;

        String Deployment = """
                Problem:
                ->How do we deploy hundreds of small microservices with less effort and lower cost?
                """;

        String Portability = """
                Problem:
                -> How do we move microservices across different environments (dev, QA, prod, cloud)
                """;

        String Scalability = """
                Problem:
                -> How do we scale applications dynamically based on demand?
                -> How to scale on the fly with minimum effort and cost?
                """;

        String solution = """
                To overcome these challenges, we containerize microservices.
                
                🔹 Why Containerization?
                
                Containers provide a self-contained and isolated environment
                Include:
                ->Application
                ->Runtime
                ->Dependencies
                
                Makes applications:
                ->Portable
                ->Consistent
                ->Cloud-ready
                """;

        String docker = """
                Docker is an open-source platform that allows packaging and running applications
                in a loosely isolated environment called a container.
                """;
    }
}
