package com.conceptual;

public class J26_Process_vs_Thread {
    public static void main(String[] args) {

        String process = """
                -> Process is an independent program.
                -> Each process has its own memory and space.
                -> Processes are handled by the OS.
                """;

        String thread = """
                -> A thread is a smaller unit of execution within a process.
                -> All threads in the same process share memory.
                
                Real-world example: In a video calling app (like Zoom), multiple threads may be running:
                One thread handles audio.
                Another handles video.
                A third listens for chat messages.
                All of these threads live inside one single process: the Zoom app.
                """;

        String realLifeAnalogy = """
                Real-Life Analogy
                🏭 Process = Whole Company
                👨‍💼 Thread = Employees inside the company
                
                Each company has its own building → process has its own memory
                
                Employees inside share the same office → threads share memory
                
                Adding a new employee is easier than building a new company → thread is lightweight
                """;
    }
}
