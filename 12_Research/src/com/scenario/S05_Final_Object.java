package com.scenario;

public class S05_Final_Object {

    String name = "Dileep";

    public static void main(String[] args) {

        final S05_Final_Object obj = new S05_Final_Object();
        obj.name = "Dipu";
        System.out.println(obj.name);
        /*
        final means, we can’t reassign the value to Person object ‘p’ but we can change the state.
         */
    }
}
