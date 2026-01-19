package com.angular;

public class A03_Angular_Component {
    public static void main(String[] args) {

        String whatIsComponent = """
                -> It is a basic build block of an angular application
                -> It is an reusable UI block that controls the part of the system.
                """;

        String codeSnippet = """
                @Component({
                  selector: 'app-root',
                  templateUrl: './app.component.html',
                  styleUrls: ['./app.component.css']
                })
                export class AppComponent {
                  title = 'AngDemo';
                }
                """;

        String explanation = """
                @Component -> It is Component decorator which makes the class a component.
                selector -> It specifies the tag name tha will used in html file to load the component.
                styleUrls -> Specifies the template or HTML file to be rendered when the component is loaded
                             in the HTML page.
                export -> To make it accessible in other components, export is used.
                """;

    }
}
