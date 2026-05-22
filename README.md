# Java Custom Exception Handling

A simple Java project demonstrating:

- Custom Checked Exceptions
- Custom Unchecked Exceptions
- `throw` keyword
- `throws` keyword
- Exception handling using `try-catch`

---

# Author

**Shubham Tiwari**

---

# What are Exceptions in Java?

Exceptions are unwanted events that occur during the execution of a program and interrupt the normal flow of the application.

Java provides a powerful exception handling mechanism using:

- `try`
- `catch`
- `throw`
- `throws`
- `finally`

---

# Checked vs Unchecked Exceptions

## Checked Exceptions

Checked exceptions are checked at **compile time**.

These exceptions must be:

- handled using `try-catch`
- OR declared using `throws`

Example:

```java
IOException
SQLException
```

Custom Checked Exception:

```java
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
```

---

## Unchecked Exceptions

Unchecked exceptions occur at **runtime**.

These exceptions are not checked at compile time.

Example:

```java
ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException
```

Custom Unchecked Exception:

```java
public class MyRuntimeException extends RuntimeException {
    public MyRuntimeException(String message) {
        super(message);
    }
}
```

---

# throw vs throws

| Keyword | Description |
|----------|-------------|
| `throw` | Used to explicitly throw an exception |
| `throws` | Used in method signature to declare exceptions |

---

## Example of `throw`

```java
throw new MyException("Invalid Age");
```

---

## Example of `throws`

```java
public void checkEligibilityThrows(int age) throws MyException
```

---

# Project Structure

```text
.
├── Main.java
├── Voter.java
├── MyException.java
└── MyRuntimeException.java
```

---

# Source Code

## Main.java

```java
public class Main {

    public static void main(String[] args) throws Throwable {

        Voter aman = new Voter();

        aman.checkEligibilityHandled(17);

        aman.checkEligibilityThrows(16);

        aman.checkEligibilityRuntime(16);
    }
}
```

---

## Voter.java

```java
public class Voter {

    // Checked Exception handled using try-catch
    public void checkEligibilityHandled(int age) {

        try {

            if (age < 18) {
                throw new MyException("you are not eligible to vote");
            }

        } catch (MyException e) {

            System.out.println("Exception handled: " + e.getMessage());
        }
    }

    // Checked Exception using throws keyword
    public void checkEligibilityThrows(int age) throws MyException {

        if (age < 18) {

            throw new MyException(
                    "you are not eligible to vote from method signature");
        }
    }

    // Unchecked Exception
    public void checkEligibilityRuntime(int age) {

        if (age < 18) {

            throw new MyRuntimeException(
                    "you are not eligible to vote from runtime exception");
        }
    }
}
```

---

## MyException.java

```java
public class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }
}
```

---

## MyRuntimeException.java

```java
public class MyRuntimeException extends RuntimeException {

    public MyRuntimeException(String message) {
        super(message);
    }
}
```

---

# Output

```text
Exception handled: you are not eligible to vote

Exception in thread "main"
MyException: you are not eligible to vote from method signature

Exception in thread "main"
MyRuntimeException: you are not eligible to vote from runtime exception
```

---

# Concepts Covered

- Custom Exception Creation
- Checked Exception
- Unchecked Exception
- Exception Propagation
- `throw` Keyword
- `throws` Keyword
- `try-catch` Handling

---

# Learning Purpose

This project is created for beginners who want to understand:

- how exceptions work in Java
- difference between checked and unchecked exceptions
- how to create custom exceptions
- how exception propagation works

---

# Future Improvements

- Add `finally` block examples
- Add multiple catch blocks
- Add real-world validation examples
- Add logging using Logger

---

# License

This project is open source and free to use for learning purposes.