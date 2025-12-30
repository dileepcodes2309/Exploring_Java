package com.microservices;

public class M16_Storing_Properties_In_ClassPath {
    public static void main(String[] args) {

        String howToDo = """
                -> Create a folder named as config inside resource in Config server application.
                -> Copy all the configuration files from application and put those files in newly
                   created folder config.
                -> Rename those file as accounts.yml, accounts_qa.yml and accounts_prod.yml
                -> Remove below property from qa and prod
                    spring:
                      config:
                        activate:
                          on-profile: "qa"
                -> Add few more properties
                -> spring:
                     profiles:
                       active: native
                     cloud:
                       config:
                         server:
                           native:
                             search-locations: "classpath:/config"
                -> Start the config server and try to access the properties:
                   http://localhost:8071/accounts/default
                   http://localhost:8071/accounts/qa
                   http://localhost:8071/accounts/prod
                """;

        String changeInMicroservice = """
                -> Delete qa and prod related yml files because we are storing in config folder
                -> Give a name to microservice.
                -> Add below property
                   spring:
                     application:
                       name: "accounts"
                     profiles:
                       active: "qa"
                     config:
                       import: "optional:configserver:http://localhost:8071/"
                -> Add Config Client Dependency 
                """;
    }
}
