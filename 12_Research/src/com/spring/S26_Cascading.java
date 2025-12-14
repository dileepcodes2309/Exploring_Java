package com.spring;

public class S26_Cascading {

    public static void main(String[] args) {

        String cascading = """
                Cascading means that an operation done on parent class automatically reflects
                to its child entity.
                
                PERSIST: Save parent also saves child.
                REMOVE: Deleting parent deletes child.
                MERGE: Updating parent updates child.
                REFRESH: Refresh parent refreshes child.
                ALL: Applies all above.
                """;


    }
}
