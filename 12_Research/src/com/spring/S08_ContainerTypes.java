package com.spring;

public class S08_ContainerTypes {
    public static void main(String[] args) {

        String iocTypes = """
                -> Spring provides two types of container
                BeanFactory
                ApplicationContext
                """;

        String beanFactory = """
                It is just like a factory that contains a factory of beans.
                It instantiates the beans whenever asked by the clients.
                """;

        String applicationContext = """
                It is an interface that built on top of the BeanFactory interface
                It provides some extra functionality on the top of BeanFactory.
                """;
    }
}
