package com.spring;

public class S25_JPA {
    public static void main(String[] args) {

        String problemWithHibernate = """
                ->Hibernate was powerful, but it was vendor-specific.
                ->If tomorrow we wanted to switch to another ORM framework,
                  we have to rewrite a lot of code, because Hibernate APIs are not standard.
                """;

        String JPA_Fix = """
                To solve this, JPA (Java Persistence API) was introduced by Sun/Oracle as a standard specification.
                
                JPA defines a set of common annotations (@Entity, @Id, @Table, etc.)
                and methods (persist(), remove(), find()).
                Different frameworks like Hibernate, EclipseLink, OpenJPA can implement JPA.
                
                JPA (Java Persistence API) is a specification (or interface) for ORM (Object-Relational
                Mapping) in Java.Hibernate is a concrete implementation of JPA.
                """;
    }
}
