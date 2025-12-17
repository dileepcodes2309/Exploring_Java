package com;

public class Interview {
    public static void main(String[] args) {
        String qna = """
                
                3️⃣ Third-party libraries used
                
                “Apart from Spring Boot starters, we use Hibernate, Lombok, Jackson, JWT libraries, Redis for caching,
                Swagger for API documentation, and Mockito with JUnit for testing.”
                
                4️⃣ Exceptions faced
                
                “Common exceptions include NullPointerException, validation exceptions, database constraint violations,
                 JWT expiration exceptions, and authorization exceptions. We handle them centrally using a
                 global exception handler.”
                
                5️⃣ How Agile works in your project
                
                “We follow Scrum. Each sprint starts with planning, then daily stand-ups, development,
                 sprint review, and retrospective. Jira is used for tracking stories and bugs.”
                
                6️⃣ How do you start when assigned a task?
                
                “First I understand the requirement and acceptance criteria, clarify doubts with the product owner,
                 analyze the impact, design the solution, implement it, write unit tests, and then raise a pull request.”
                
                7️⃣ Task needs 2 sprints but PO expects 1
                
                “I communicate this early with the product owner, explain the complexity and risks, and propose breaking
                 the work into phases so that partial functionality can still be delivered in one sprint.”
                
                8️⃣ Testing before QA
                
                “Before handing over to QA, I run unit tests, integration tests, perform local and API testing,
                 and ensure the code review is completed.”
                
                9️⃣ Handling bugs from QA
                
                “I reproduce the issue, identify the root cause, fix it, add test coverage if required, and
                 retest before moving it back to QA.”
                
                🔟 Debugging a priority prod issue
                
                “I first check logs and monitoring tools, identify the impact, apply a hotfix or rollback if required, and
                 later do a root cause analysis to prevent recurrence.”
                
                11️⃣ Application architecture
                
                “We use a layered architecture with REST APIs built using Spring Boot. Security is implemented using JWT,
                 data is stored in relational databases, Redis is used for caching, and CI/CD handles deployments.”
                
                12️⃣ Java version & features
                
                “We are using Java 17. It includes features like records, pattern matching, sealed classes, text blocks,
                 and overall performance improvements.”
                
                13️⃣ Spring version & features
                
                “We are using Spring Boot 3.x which supports Jakarta EE, improved observability, better security configuration,
                 and faster startup.”
                
                14️⃣ Most complicated task
                
                “Recently I worked on migrating a service from Spring Boot 2 to 3, including security changes and dependency
                 upgrades, and also optimized a slow API using caching and query optimization.”
                
                15️⃣ Role of design patterns
                
                “Design patterns provide proven solutions, improve code readability, and make the system easier to extend
                 and maintain.”
                
                16️⃣ Design patterns used
                
                “We commonly use Singleton, Factory, Builder, Strategy, Repository, and DTO patterns.”
                
                17️⃣ SOLID principles
                
                “Yes, we follow SOLID principles to keep code modular, loosely coupled, and easy to maintain.”
                
                18️⃣ Code coverage & SonarQube
                
                “We track code coverage using JaCoCo and use SonarQube to detect bugs, code smells, and security issues.”
                
                19️⃣ Build automation
                
                “We use Maven for builds and Jenkins or GitHub Actions for CI/CD pipelines which handle build, test,
                 analysis, and deployment.”
                
                20️⃣ Security implementation
                
                “Security is implemented using Spring Security with JWT authentication, role-based authorization,
                 password encryption, and standard security checks.”
                
                21️⃣ Code review process
                
                “We follow a pull-request based review where peers review code for logic, standards, and performance before merging.”
                
                22️⃣ Improving code quality
                
                “I focus on refactoring, writing tests, following coding standards, reducing duplication, and
                 addressing Sonar issues.”
                
                23️⃣ Day-to-day tasks
                
                “My daily work includes development, bug fixes, code reviews, meetings, testing, and deployments.”
                
                24️⃣ Dependency upgrades
                
                “I check release notes, upgrade incrementally, run regression tests, and validate in lower environments
                 before production.”
                
                25️⃣ Testing tools used
                
                “JUnit, Mockito, MockMvc, Postman, and SonarQube.”
                
                26️⃣ New requirements mid-sprint
                
                “I re-analyze the scope, re-estimate effort, discuss with the product owner, and adjust priorities if required.”
                
                27️⃣ Learning new concepts
                
                “I refer to official documentation, blogs, build small POCs, and discuss with teammates.”
                
                28️⃣ What is SDLC?
                
                “SDLC is the process of building software starting from requirement gathering, design, development,
                 testing, deployment, and maintenance.”
                
                29️⃣ Task flow from story to QA
                
                “Once a story is assigned, I estimate it, design and implement the solution, test it, raise a PR,
                 and after merge deploy it to QA.”
                
                30️⃣ Ensuring acceptance criteria
                
                “I map each acceptance criterion to implementation and test cases, and verify everything before marking
                 the story complete.”
                
                31️⃣ Again: 2 sprints vs 1 sprint
                
                “I communicate early, explain realistic timelines, and propose phased delivery instead of over-committing.”
                """;
    }
}
