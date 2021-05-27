# Lambdas  
> Lambdas enable functional programming in Java (added in Java 8)
- It gives us the ability to define behavior indepedent of a class (we can't do this in traditional Java)
    - such as: creating implementation for classes, or interfaces, directly into a variable

### Lambda Expressions 
- First, make a functional interface (special kind of interface, but nothing crazy)
    - A **Functional Interface** has only one abstract method  
    - Can have other concrete methods - but there must be one abstract method  
- `@FunctionalInterface` 
- We use arrow notation to define parameters and segments of code that will be the implementation of that interface.