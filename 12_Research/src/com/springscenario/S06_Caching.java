package com.springscenario;

public class S06_Caching {
    public static void main(String[] args) {

        /*
        Your application is having performance issues due to frequent queries to Database.
        How would you cache the data
         */

        String explanation = """
                Spring boot provides various caching solutions such as EhCache,
                Redis, Hazelcast and In-memory (for small data).
                
                We need to use these Annotations: @EnableCaching, @Cachable, @CachePut, @CacheEvict.
                """;

        String enablingCaching = """
                @EnableCaching is a Spring annotation used to enable annotation-driven cache management in a Spring.
                
                When this annotation is present, Spring:
                
                Detects caching annotations like
                @Cacheable, @CachePut, and @CacheEvict
                
                Creates proxy classes to apply caching logic
                
                Manages cache storage using the configured cache provider (in-memory, Redis, etc.)
                """;

        String cachable = """
                -> This annotation marks a method whose result can be cached.
                -> When a method annotated with @Cacheable is invoked, Spring checks 
                   if the result for the given arguments is already present in the cache.
                   If found, the cached value is returned, avoiding method execution.
                   If not found, the method is executed, and its result is stored in the cache for future use.
                """;

        String cachePut = """
                This annotation is used to update the cache with the new result of a method
                execution without skipping the method execution itself.
                """;

        String cacheEvict = """
                This annotation is used to remove one or more entries from a cache. It is typically applied
                to methods that modify data, ensuring that stale cached data is removed after an update or
                deletion operation.
                """;
    }
}
