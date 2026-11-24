# Day 05 - Spring Bean Life Cycle

## 📚 Topic: Spring Bean Life Cycle

Today, I learned about the **Spring Bean Life Cycle** and how the Spring IoC Container manages beans from their creation to their destruction.

## 1. What is Spring Bean Life Cycle?

The Spring Bean Life Cycle describes the complete process through which a Spring bean passes, from instantiation until destruction.

Spring Container manages this lifecycle automatically.

## 2. Stages of Bean Life Cycle

The major stages are:

1. **Instantiation** – Spring creates the bean object.
2. **Dependency Injection** – Spring injects the required dependencies.
3. **Aware Interfaces** – Spring provides container-related information to the bean.
4. **BeanPostProcessor (Before Initialization)** – Executes before initialization callbacks.
5. **Initialization** – Initialization methods are executed.
6. **BeanPostProcessor (After Initialization)** – Executes after initialization callbacks.
7. **Ready to Use** – Bean is ready for application use.
8. **Destruction** – Spring executes cleanup callbacks when the bean is destroyed.

## 3. Important Annotations and Interfaces

| Annotation / Interface | Description |
|---|---|
| `@PostConstruct` | Executes after dependency injection |
| `InitializingBean` | Provides `afterPropertiesSet()` method |
| `@PreDestroy` | Executes before bean destruction |
| `DisposableBean` | Provides `destroy()` method |
| `BeanNameAware` | Provides the bean name |
| `ApplicationContextAware` | Provides access to ApplicationContext |
| `BeanPostProcessor` | Allows custom processing before and after initialization |

## 4. Initialization Callback Order

1. Constructor execution
2. Dependency Injection
3. Aware interface callbacks
4. `BeanPostProcessor.postProcessBeforeInitialization()`
5. `@PostConstruct`
6. `InitializingBean.afterPropertiesSet()`
7. Custom initialization method (`init-method`)
8. `BeanPostProcessor.postProcessAfterInitialization()`

## 5. Destruction Callback Order

1. `@PreDestroy`
2. `DisposableBean.destroy()`
3. Custom destruction method (`destroy-method`)

## 6. Practical Implementation

Created a practical Java project to understand how the Spring Container manages beans.

### Concepts Practiced

- Bean Creation
- Dependency Injection
- Bean Initialization
- Bean Destruction
- Lifecycle Callback Methods
- Aware Interfaces

## 7. Key Learnings

- Spring Container manages the lifecycle of Spring beans.
- Initialization callbacks execute after dependency injection.
- We can execute custom logic during bean initialization.
- Destruction callbacks help perform cleanup operations.
- `BeanPostProcessor` can modify or wrap beans during initialization.

## 🎯 Learning Outcome

Successfully understood the Spring Bean Life Cycle and learned how Spring manages bean initialization and destruction using lifecycle callbacks.

---

**Day 05 Completed! ✅**

### Technologies Used
- Java
- Spring Framework
- Maven
- IntelliJ IDEA

#Java #SpringFramework #SpringBoot #SpringCore #LearningJourney #100DaysOfCode
