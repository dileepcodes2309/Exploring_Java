package com.angular;

public class A09_Data_Binding {
    public static void main(String[] args) {

        String dataBinding = """
                Data binding is the way Angular connects the component (TypeScript) and the
                template (HTML) so data stays in sync.
                """;

        String bindingTypes = """
                One-way binding
                Two-way binding
                """;

        String oneWayBinding = """
                It allows the data to flow from component to template or template to component.
                
                Interpolation -> <p>Hello {{ name }}</p>
                Proper binding -> <input [value]="username">
                """;

        String twoWayBinding = """
                Two-way data binding means data flows in BOTH directions:
                From component → template
                From template → component
                
                It uses [()] (banana in a box) syntax.
                """;

        String attributeBinding = """
                Property binding will not work for a few elements/pure attributes like ARIA,
                SVG, and COLSPAN. In such cases, you need to go for attribute binding.
                """;


    }
}
