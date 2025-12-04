package com.scenario;

public class S02_TotalObjects {
    public static void main(String[] args) {
        String s1 = "Dileep";
        String s2 = "Dileep";
        String s3 = new String("Dileep");

        System.out.println("Total objects:"+3);
        System.out.println("------------------------------");

        String explanation = """
                1️⃣ String s1 = "Dileep";
                
                "Dileep" is created in String Constant Pool (SCP)
                
                s1 points to that SCP object
                ✔ Objects so far: 1
                
                2️⃣ String s2 = "Dileep";
                
                JVM checks SCP → "Dileep" already exists
                
                No new object created
                
                s2 points to the same SCP object
                ✔ Still total objects: 1
                
                3️⃣ String s3 = new String("Dileep");
                
                This line creates exactly 1 new object in Heap.
                
                "Dileep" inside new String("Dileep") refers to the same SCP literal
                
                But new String() creates a separate object in Heap
                
                ✔ New object created: 1 (in Heap)
                
                ✔ SCP literal is not recreated.
                
                🎯 Total Objects Created = 2
                ✔ 1 object in String Constant Pool
                ✔ 1 object in Heap (created by new String())
                """;

        System.out.println(explanation);
    }
}
