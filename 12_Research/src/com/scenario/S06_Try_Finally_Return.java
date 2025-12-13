package com.scenario;

public class S06_Try_Finally_Return {
    public static void main(String[] args) {

       testing();

    }

    private static void testing() {

        try {
            return;
        }
        finally {
            System.out.println("In finally");
        }
    }
}

/*
Even try return the value, finally still executes before method returns.
So, Output is “In finally”.
 */
