# Java Day 1  

## Download JDK and Maven and Eclipse/STS

## Types of Programming Languages
- Binary
    - Lowest level
    - Not actually written
    - 0s and 1s
- Assembly
    - Language used by the processor (CPU) to generate binary.
- Compiled Languages
    - Written in plain text so they need to be transformed into another form that can be directly used by the CPU (Assembly) or another application (interpreted language)
- Interpreted / Scripting Languages
    - Treated as a series of instructions by other software, which in turn generates Assembly from it.
    - Generally, interpreted languages are not human-readable, but scripting languages are
- Markup Languages
    - Used by another application to give context or to **describe** static content. 
    - **Not a programming language**

## Java Notes
### **Background / High Level**
> Java is very OOP (Object Oriented Programming). This is by design.  
- Java was going for Scalability.
    - Python => readability 
    - JavaScript => flexibility
- Java is not flexible. Forces into good patterns. 
- Java runs on the JVM (Java Virtual Machine)
    - allows any Java program to run consistently on any device that has a JVM
- Java has **massive** ecosystem of software and support. 
    - Has great frameworks (Spring)

### **Core Features**
- Automatic Memory Management (garbage collection)
    - developers are not responsible for managing memory (like in C).
- Object Oriented
    - Classes and Interfaces
    - Objects and Methods 
- Strongly and statically typed
    - Strongly => a variable cannot change its type once it has been assigned
    - Statically => a variable's type must be declared when created
- Compiled Language
    - source code is written into a `.java` file
        - human-readable text
    - this compiles into a `.class` file
        - Java byte code to be read by a machine (not meant for humans)

### **JDK, JRE, JVM**
- **JDK**: Java Development Kit
    - software development for developing Java applications
        - *aka a kit (or package) that provides the environment to **develop** and **execute (run)** Java programs*
    - Includes:
        - JRE
        - interpreter/loader (java)
        - compiler (javac)
        - other tools needed in Java Development 
- **JRE**: Java Runtime Environment (*sometimes JRTE*)
    - provides the minimum requirements for executing a Java application
        - *aka provides environemtn the **run (and only run - NOT develop)** Java programs*
    - Consists of:
        - JVM
        - core libraries, classes, and supporting files
- **JVM**: Java Virtual Machine
    - instance of the JRE at runtime
    - WORA (Write Once, Run Anywhere)
        - any Java program will work the same on any device with a JVM

## Code!