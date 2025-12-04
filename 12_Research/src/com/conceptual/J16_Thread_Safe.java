package com.conceptual;

public class J16_Thread_Safe {
    public static void main(String[] args) {

        String def = """
                A thread-safe code or object behaves correctly even when multiple threads
                access it simultaneously.
                
                No corruption
                No inconsistent values
                No unexpected results
                """;

        String howToMakeCodeThreadSafe = """
                ✔ synchronized keyword
                ✔ Using atomic classes (AtomicInteger, AtomicBoolean)
                ✔ Using thread-safe collections
                
                (e.g., Vector, ConcurrentHashMap)
                
                ✔ Immutable objects
                
                (String, Integer, LocalDate, custom immutable classes)
                
                ✔ Locks (ReentrantLock)
                ✔ Using volatile (for visibility)
                """;
    }
}
