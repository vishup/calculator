# Calculator using ANTLR

## Steps to run

1. Open the project in any IDE.
2. Run `mvn clean compile` to compile code.
3. To run tests, use `mvn test`.
4. If compilation is successful, program can be run from `Calculate.java`. 

## Change and compile Calculator grammar

1. If there are any changes made in `Calculator.g4`, please run `mvn compile antlr4:antlr4` to generate classes and compile the code.
2. ANTLR Maven plugin CLI parameters can be found [here](https://www.antlr.org/api/maven-plugin/latest/antlr4-mojo.html).
 