#     Java-Concurrency-and-Design-Patterns
_Assignment: Concurrent Programming & Design Patterns (Winter 2022)_

This repository contains several small Java exercises from the **Concurrent Programming** and **Design Patterns** course.  
Each folder demonstrates a specific concept, such as implementing promises, solving synchronization problems, or applying classical design patterns.

---

## Table of Contents
- [Repository Structure](#repository-structure)
- [Tasks – Description](#tasks--description)
  - [Concurrency / Task 1 – Promise](#concurrency--task-1--promise)
  - [Concurrency / Task 3 – Dining Philosophers](#concurrency--task-3--dining-philosophers)
  - [Design Patterns / Task 2 – Critical Section with Semaphores](#design-patterns--task-2--critical-section-with-semaphores)
  - [Design Patterns / Task 4 – Abstract Factory](#design-patterns--task-4--abstract-factory)
  - [Design Patterns / Task 5 – Builder](#design-patterns--task-5--builder)
- [How to Run](#how-to-run)
- [Possible Improvements](#possible-improvements)
- [License](#license)

---

## Repository Structure
```text
Java-Concurrency-and-Design-Patterns/
├─ Concurrency/
│ ├─ ZAD_1/src/z1/Z1.java # Promise (blocking retrieval of a result)
│ └─ ZAD_3/src/z3/Z3.java # Dining Philosophers problem (Semaphore)
└─ DesignPatterns/
├─ ZAD_2/src/z2/Z2.java # Critical Section with semaphores
├─ ZAD_4/src/z4/Main.java # Abstract Factory pattern
└─ ZAD_5/src/z5/Main.java # Builder pattern
```
---

## Tasks – Description

### Concurrency / Task 1 – Promise
**Goal:** Implement a simple _Promise_ mechanism in Java.  
A consumer thread blocks until the producer provides a value.

**Implementation hints:**
- Use `wait()`/`notifyAll()` or `Condition` with `ReentrantLock`.
- States: `pending` → `fulfilled` (+ store the value or an exception).
- Methods: `set(value)`, `get()` (blocking), optionally `setException(Throwable)`.

---

### Concurrency / Task 3 – Dining Philosophers
**Goal:** Solve the classical **Dining Philosophers problem** with semaphores, ensuring no deadlock occurs.

**Implementation hints:**
- Represent chopsticks as `Semaphore(1)` objects.  
- Avoid deadlock using one of the strategies:
  - asymmetric picking order (one philosopher takes forks in opposite order),  
  - limit concurrent eaters with `Semaphore(4)`,  
  - or resource hierarchy.  
- Simulate “thinking” and “eating” phases with thread sleeps and logging.

---

### Design Patterns / Task 2 – Critical Section with Semaphores
**Goal:** Implement a shared resource protected by a **semaphore**, ensuring thread-safe access.

**Implementation hints:**
- Use `Semaphore(1)` as a mutex or `Semaphore(n)` for limited access.  
- Correctly acquire and release the semaphore (even when exceptions occur).  
- Demonstrate with multiple threads trying to enter the critical section.

---

### Design Patterns / Task 4 – Abstract Factory
**Goal:** Demonstrate the **Abstract Factory** pattern.

**Implementation hints:**
- Define product interfaces (e.g., `Button`, `Checkbox`).  
- Provide concrete implementations (e.g., `WinButton`, `LinuxButton`).  
- Create an `AbstractFactory` interface with methods for creating products.  
- Implement `WinFactory`, `LinuxFactory`, etc.  
- In `Main`, choose the appropriate factory and build a family of related objects.

---

### Design Patterns / Task 5 – Builder
**Goal:** Demonstrate the **Builder** pattern for constructing complex objects step by step.

**Implementation hints:**
- Example object: `Pizza`, `Report`, or `Computer` with many optional fields.  
- Provide a `Builder` class with fluent methods: `.withX(...)`, `.withY(...)`, `.build()`.  
- Validate object consistency inside `build()`.  
- Show how different configurations can be created without constructor overloads.

---

## How to Run

Each task is a small standalone Java program. The easiest way is to run them from an IDE:

1. **Clone the repository**
   ```bash
   git clone https://github.com/Splendorius/Java-Concurrency-and-Design-Patterns.git
   
2.Open in IDE (IntelliJ IDEA / Eclipse).

3. Set the main class for each task:

```text
  Concurrency/ZAD_1/src/z1/Z1.java
  Concurrency/ZAD_3/src/z3/Z3.java
  DesignPatterns/ZAD_2/src/z2/Z2.java
  DesignPatterns/ZAD_4/src/z4/Main.java
  DesignPatterns/ZAD_5/src/z5/Main.java
```
4. Run directly from the IDE or compile and run from the command line.

Note: some files contain TODOs – they were meant to be extended or completed as part of the coursework.
