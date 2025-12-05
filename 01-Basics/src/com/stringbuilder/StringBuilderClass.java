package com.stringbuilder;

public class StringBuilderClass {
    public static void main(String[] args) {
        String meaning = """
                Every method present in StringBuffer is declared as synchronized hence at a
                time only one thread is allowed to operate on the StringBuffer object due to this,
                waiting time of the threads will be increased and effects performance of the
                system.
                
                To overcome this problem sun people introduced StringBuilder concept in 1.5v.
                """;

        System.out.println(meaning);
    }
}
