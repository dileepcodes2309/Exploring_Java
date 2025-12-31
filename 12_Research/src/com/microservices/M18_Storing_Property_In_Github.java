package com.microservices;

public class M18_Storing_Property_In_Github {
    public static void main(String[] args) {

        String howToDo = """
                -> Create a github repo and move all your config files to hat repo.
                -> Activate the git profile
                     profiles:
                       active: git
                -> Add below property:
                     cloud:
                       config:
                         server:
                           git:
                             uri: "https://github.com/dileepcodes2309/microservices-config.git"
                             default-label: main #branch name
                             time-out: 5 #config server will wait only for 5s to connect to GitHub repo
                             clone-on-startup: true
                             force-pull: true
                """;
    }
}
