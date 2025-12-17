package com.springscenario;

public class S07_Scheduling_Task {
    public static void main(String[] args) {
        /*
        Imagine you are building an e-commerce application. Every midnight,
        you need to generate a sales report and send it to management.
        Doing this manually is painful and error-prone. How would you achieve this?
         */

        String answer = """
                -> Spring has a mechanism to schedule the tasks using @EnableScheduling and @Scheduled.
                -> We need tell Spring to turn on the scheduler by using @EnableScheduling.
                
                @Scheduled(cron = "0 0 0 * * ?")
                    public void generateDailySalesReport() {
                        log.info("Starting daily sales report generation at {}", LocalDateTime.now());
                
                        // TODO: Fetch sales data
                        // TODO: Generate report
                        // TODO: Save report to DB or send email
                
                        log.info("Daily sales report generation completed at {}", LocalDateTime.now());
                    }
                """;
    }
}
