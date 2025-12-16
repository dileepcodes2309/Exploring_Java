package com.spring;

public class S34_JWT_Structure {
    public static void main(String[] args) {

        String whatIs = """
                ->A JWT (JSON Web Token) is just a long string,
                  but it is actually made of three distinct parts, separated by dots (.):
                """;

        String jwtStructure = """
                1.Header
                A small JSON object that describes the token.
                It usually contains:
                The type of token (typ) , always "JWT".
                The signing algorithm used (alg) ike "HS256" or "RS256".
                
                2. Payload
                This is the main content of the token.
                It holds the information about the user and some metadata.
                Claims are key-value pairs, for example:
                sub: Subject (the user ID)
                name: Username
                roles: User’s roles or authorities
                exp: Expiration time of the token
                
                3. Signature
                This is the security part of the token 
                It is created by Base64UrlEncode(header) + "." + Base64UrlEncode(payload) and
                then signing it with a secret key or private key using the algorithm from the header.
                """;
    }
}
