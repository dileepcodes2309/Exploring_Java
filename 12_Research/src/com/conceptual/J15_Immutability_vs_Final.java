package com.conceptual;

public class J15_Immutability_vs_Final {
    public static void main(String[] args) {

        String Final = """
                final means we can’t reassign the variable.
                """;

        String Immutability = """
                Immutability means the object's internal data can’t be changed.
                """;

        System.out.println(Final);
        System.out.println(Immutability);
    }
}
