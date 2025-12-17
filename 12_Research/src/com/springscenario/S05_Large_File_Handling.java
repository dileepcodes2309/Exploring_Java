package com.springscenario;

public class S05_Large_File_Handling {
    public static void main(String[] args) {

        /*
        Client might upload a large file through the API. How would you handle this to avoid memory issues?
         */

        String answer = """
                -> In many production systems, we don’t use REST API handle GBs of data directly.
                -> Instead, we issue a pre-signed URL from S3, GCS, or Azure.
                -> Client uploads file directly to cloud while your API just coordinates.
                """;
    }
}
