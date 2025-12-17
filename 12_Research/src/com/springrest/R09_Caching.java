package com.springrest;

public class R09_Caching {
    public static void main(String[] args) {

        String whatIsCaching = """
                Caching means storing frequently used data in a fast storage location so it
                can be reused instead of being recomputed or fetched again.
                """;

        String implementation = """
                -> Caching in REST APIs can be implemented using HTTP caching headers like Cache-Control and ETag.
                -> Server-side caching using Spring Cache annotations such as @Cacheable, @CachePut, and @CacheEvict.
                """;
    }
}
