package com.spring;

public class S24_Hibernate {
    public static void main(String[] args) {

        String hibernate= """
                Hibernate is the most popular ORM framework in Java.
                It implements ORM and makes database interaction much simpler.
                
                Key features:
                1. Automatic Mapping: Maps Java classes to DB tables using annotations.
                2. No need for boilerplate SQL: We use methods like save(), update(), delete().
                3. HQL (Hibernate Query Language): We can query using object names instead of table names.
                4. Caching: Improves performance by storing frequently used data in memory.
                5. Database independence: Same code works for MySQL, PostgreSQL, Oracle, etc. We need to just change the config.
                """;
    }
}
