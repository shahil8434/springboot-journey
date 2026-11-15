# Day 03 – Spring Bean Scope

## Overview
This project demonstrates the concept of **Spring Bean Scopes** using Java-based configuration in the Spring Framework.

It explains how Spring manages bean objects and the difference between Singleton and Prototype scopes.

## Topics Covered
- Spring IoC Container
- Dependency Injection
- `@Configuration` Annotation
- `@Bean` Annotation
- Singleton Bean Scope
- Prototype Bean Scope
- Spring Bean Lifecycle
- Object Creation and Management

## Technologies Used
- Java
- Spring Framework
- Maven
- IntelliJ IDEA

## Project Structure

```text
BeanScopeDemo/
│
├── src/
│   └── main/
│       └── java/
│           └── ...
│
├── pom.xml
├── .gitignore
└── README.md
```

## Bean Scopes

### 1. Singleton Scope
- Default scope in Spring.
- Only one bean instance is created per Spring IoC container.
- The same object is returned whenever the bean is requested.

### 2. Prototype Scope
- A new bean instance is created every time the bean is requested.
- Useful when separate object instances are required.

## How to Run
1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Wait for Maven dependencies to load.
4. Run `Main.java`.
5. Check the console output to understand bean creation and object references.

## Learning Outcome
- Understood Singleton and Prototype bean scopes.
- Learned how Spring manages bean instances.
- Practiced Java-based Spring configuration.
- Improved understanding of Dependency Injection.

---

**Day 03 completed – Spring Framework Learning Journey 🚀**

GitHub: [shahil8434](https://github.com/shahil8434)
