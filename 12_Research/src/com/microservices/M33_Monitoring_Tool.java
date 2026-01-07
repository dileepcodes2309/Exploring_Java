package com.microservices;

public class M33_Monitoring_Tool {
    public static void main(String[] args) {

        String whatToUse = """
                -> Grafana, Loki, and Promtail are open-source observability tools commonly used together
                   for monitoring, logging, and troubleshooting modern applications—especially microservices,
                   containers, and cloud-native systems.
                """;

        String grafana = """
                -> Grafana is a visualization and monitoring platform.
                -> It helps you view, analyze, and alert on metrics, logs, and traces using dashboards.
                
                """;

        String loki = """
                -> Loki is a log aggregation system designed by Grafana Labs.
                """;

        String promtail = """
                -> Promtail is a log collector/agent.
                """;

        String summary = """
                Promtail → collects logs
                
                Loki → stores logs
                
                Grafana → visualizes logs & metrics
                """;
    }
}
