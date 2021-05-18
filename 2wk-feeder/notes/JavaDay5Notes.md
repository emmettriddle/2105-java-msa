# Java Day 5

## 4 Pillars of Object-Oriented Programming

### Abstraction  
> The process of hiding implementation and processes of an entity to reduce complexity or increase understanding of a system's properties

### Polymorphism
> The ability for objects, classes, variables, and/or methods to alter functionality while maintaining structure.

### Inheritance
> The ability for entities to adopt variables (fields) and/or methods (behaviors) from a parent (super) class.  
> This allows for instantiating child objects from said parent class  
> IS-A relationship.  
> We use the `extends` keyword

- Essentially, Inheritance copies *visible* variables and methods from a parent class into a child class. 
- It promotes code reusability, reduces duplication and redundancy. 
- Enables polymorphism and code flexibility (more on this later)
- Structures classes into an understandable hierarchy.

> All classes in Java implicitly inherit from the Object Class. 
> This means that all objects inherit the Object Class' attributes and behaviors - which we can override to provide a unique implementation. 

### Encapsulation  
> The act of wrapping code into a single unit and then selectively exposing and restricting access to that code based on functionality or use within classes. 

- Classes should allow minimum necessary access to their members.   
- Access to class variables should be done through methods that can perform validation or are designed specifically to perform mutation or accessing functionality.   
- These methods are commonly referred to as "Getters" and "Setters" (*Accessors and Mutators*)
- Least amount of access is standard practice
    - We want classes to be the only ones responsible for themselves.  

### Access Modifiers: How we achieve encapsulation in Java
- There are 4 access modifiers: 
- **public**: accessible to all classes, everywhere
- **protected**: accessible to all classes in the same package **AND** all subclasses/children
- **default**: (package-private) accessible to all classes in the same package
- **private**: accessible only within the current class. 

- default -> denoted by the absence of an Access Modifier

## ACCESS MODIFIERS HAVE NOTHING TO DO WITH SCOPE
they are unrelated, but something that can easily be confused. 

Access Modifiers => Accessibility
Variable Scopes => Visibility 

Encapsulation is not Protection/Security  
- there are ways to change access modifiers at runtime (Java Reflections API)