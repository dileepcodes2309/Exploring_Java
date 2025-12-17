package com.springrest;

public class R11_Soap_vs_Rest {

    String soap = """
            -> SOAP is a strict protocol with specific rules and standards.
            -> Uses XML for both requests and responses.
            -> Built-in error handling, security (WS-Security), transactions, and ACID compliance.
            -> Usually HTTP, but can also use SMTP, TCP, or JMS.
            -> Enterprise applications requiring high security, reliable messaging,
               and formal contracts (like banking, payment gateways).
            """;

    String rest = """
            -> REST is not a protocol; it is a set of principles for designing APIs.
            -> Uses JSON (most common) or XML.
            -> Lightweight, stateless, supports CRUD operations via standard HTTP methods
            -> Transport: Only HTTP/HTTPS.
            -> Use Case: Web and mobile applications requiring fast, scalable, and
               flexible APIs (like social media apps, e-commerce platforms)
            """;

    String whySOAP = """
            -> SOAP uses WSDL (Web Services Description Language) which is like
               a strict contract between client and server.In finance, this ensures no ambiguity
               in request/response formats.
            
            -> SOAP supports WS-Security (signing, encryption, authentication) out of the box.
               REST relies on external mechanisms like OAuth, JWT, or HTTPS.
            
            -> Transaction Support: SOAP has standards for things like ACID transactions (WS-AtomicTransaction),
               which is critical for money transfers where operations must succeed or fail together.
            """;
}
