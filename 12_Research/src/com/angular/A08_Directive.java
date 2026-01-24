package com.angular;

public class A08_Directive {
    public static void main(String[] args) {

        String directive = """
                -> Directive is used to change the behaviour of HTML element.
                """;

        String inBuiltDirective = """
                *ngFor → Repeats an HTML element for each item in a list
                *ngIf → Adds or removes an element based on a condition
                *ngSwitch → Displays one element out of many based on a matching value
                """;

        String customDirective = """
                Command :- ng generate directive unless
                """;

        String attributeDirective = """
                Attribute directives are used to change the appearance or behavior of an existing HTML element.
                
                In-built attribute directive:
                ngStyle
                ngClass
                """;
    }
}
