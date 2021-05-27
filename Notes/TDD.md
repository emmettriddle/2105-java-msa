# Test Driven Development 

> Software development process where we write unit tests **before** we write application code.  
- Then we write app code to make our tests pass  
- Can be done for each functionality of our code  

1. Write a unit test
2. Run the test (fail - b/c we haven't written app code)
3. Write app code
4. Rerun test - until it passes
5. Rinse and repeat

**Benefits**:
- Ensure that we always have valid tests to run  
- Useful for refactoring (if our tests pass, we haven't broken our code)
- For debugging - easier to find out where/what went wrong  

### Unit Testing
> Unit testing is the testing of individual software components in isolation from the rest of the system. 
- This is done by writing unit tests which execute the code we want to inspect. 
- If the test passes, it means that the application we've designed is functioning as expected. 
- In Java, the most common unit testing framework is JUnit. 

(TestNG, Spring Test, and others in Angular (Jasmine)....)

### JUnit - Unit Testing Framework
- Unit - a section of functionality in our code. Usually, and ideally, its the smallest possible chunk of code. Commonly a single method.
- In best practice, these unit tests should be independent, cover all code, and minimize overlap. 
- Code Coverage - Percent of code that is covered (tested/reached/executed) by your test.

**JUnit Annotations**:

- `@Test` - decalres a method as a test method  
- `@BeforeClass` - setup method - runs once before all tests
- `@AfterClass` - teardown method - runs once after all tests
- `@Before` - runs before each test method
- `@After`  - runs after each test method
- `@Ignore` - doesn't run the test method

> Annotations are special constructs in Java.  
They provide metadata about the source code to the compiler and JVM.  
Can be placed on (above) classes, methods, interfaces, and more.  
Used to enforce rules or abstract away some functionality provided by a library or framework.  

### Testing Vocab  

**Test Case**: A set of inputs and conditions with their expected results. 

**Test Suite**: A group of test cases related to one another (usually through some same functionality)



<hr>

**Library**:  We add someone elses code to our project.

**Framework**:  We give our code to the framework to use. 
