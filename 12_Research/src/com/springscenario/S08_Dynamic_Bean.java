package com.springscenario;

public class S08_Dynamic_Bean {
    public static void main(String[] args) {

        /*
        Imagine you are building a payment service.
        Your app supports multiple payment gateways like PayPal, Stripe, and Razorpay.
         */

        String answer = """
                In this case, we inject all candidate beans and pick one dynamically at runtime.
                Spring won’t create/destroy beans per request, but we can route requests to the right bean.
                We can achieve this using, Strategy Pattern + @Autowired Map or List
                
                Spring injects all beans implementing an interface.
                
                You select the right one using the client parameter.
                Strategy pattern means: instead of writing many if-else for different logics,
                we keep each logic in a separate class and pick the one we need at runtime.
                This makes code clean, flexible, and easy to change without touching the main class.
                """;
    }
}
