# Festa Moments Assignment Repository

This repository contains the Java assignments completed for the Festa Moments program. Each assignment is stored in its own folder and focuses on specific Java topics and frameworks.

## Assignment Summary

### 1. Collection Frameworks (Submitted)
- **Start:** Mar 11, 2026
- **Deadline:** Mar 12, 2026 at 23:59
- **Location:** `Assignment_2/Collection_Frameworks`
- **What’s inside:**
  - `CollectionPractice.java` demonstrates core collection types:
    - `ArrayList` operations and indexing
    - `LinkedList` usage
    - `HashSet` uniqueness behavior
    - `HashMap` key/value access

### 2. Generics, Multithreading, and Java 8 Features (Submitted)
- **Start:** Mar 12, 2026
- **Deadline:** Mar 13, 2026 at 23:59
- **Location:** `Assignment_3/Generics`
- **What’s inside:**
  - `GenericClassDemo.java` shows a simple generic class with type-safe storage.
  - `MultithreadingDemo.java` runs two threads in parallel to print numbers and letters.
  - `Java8FeaturesDemo.java` uses Java 8 streams and lambda filters.

### 3. Concurrency and Synchronization (Submitted)
- **Start:** Mar 18, 2026
- **Deadline:** Apr 11, 2026 at 23:59
- **Location:** `Assignment_Threads/Threads`
- **What’s inside:**
  - `WithoutSynchronization.java` highlights race conditions in a shared bank account.
  - `Even_Odd_Sync.java` uses `wait()`/`notify()` to coordinate odd/even printing.

### 4. JDBC, Spring Frameworks, and Annotations (Submitted)
- **Start:** Mar 31, 2026
- **Deadline:** Apr 11, 2026 at 23:59
- **Locations:**
  - `Assignment_JDBC/JDBC`
  - `Assignment_SPRINGFRAMEWORKS_AND_ANNOTATIONS/spring-demo`
- **What’s inside:**
  - **JDBC module**
    - `DBConnection.java` establishes a MySQL connection.
    - `StudentCRUD.java` provides insert, read, update, and delete operations.
    - `Main.java` exercises the CRUD flow.
  - **Spring module**
    - XML-based configuration (`applicationContext.xml`) with `MainApp`.
    - Annotation-based configuration with `AppConfig` and `MainApp2`.
    - `Car` and `Engine` demonstrate dependency injection.

### 5. Transaction Management Project (Spring Boot and SQL) (Submitted)
- **Start:** Apr 18, 2026
- **Deadline:** Apr 22, 2026 at 23:59
- **Location:** `Spring_Boot`
- **What’s inside:**
  - Spring Boot REST API for a simple bank system.
  - `Account` entity + `AccountRepository` (JPA).
  - `BankService` uses `@Transactional` for safe money transfers.
  - `BankController` exposes endpoints for create, fetch, and transfer.

### 6. Student Management System (Hibernate) (Submitted)
- **Start:** Apr 24, 2026
- **Deadline:** Apr 26, 2026 at 23:59
- **Location:** `StudentManagementHibernate/student-management`
- **What’s inside:**
  - `Student` entity with Hibernate annotations.
  - `HibernateUtil` bootstraps the `SessionFactory`.
  - `Main` provides a console-based CRUD menu.
  - `hibernate.cfg.xml` contains database configuration.

### 7. Java Caching + Relationships (Submitted)
- **Start:** Apr 30, 2026
- **Deadline:** May 02, 2026 at 23:59
- **Location:** `StudentManagementHibernate/UserOrderCaching`
- **What’s inside:**
  - `UserService` uses an in-memory `HashMap` cache to store users after the first fetch.
  - `User` contains a list of `Order` objects, modeling a simple user-to-orders relationship.
  - `Main` demonstrates database fetch vs cached fetch output.

## Notes
- Most assignments are plain Java files and can be run from an IDE or via `javac/java`.
- Database-based modules (JDBC, Spring Boot, Hibernate) expect a local MySQL setup. Update connection settings in the respective configuration files if needed.
