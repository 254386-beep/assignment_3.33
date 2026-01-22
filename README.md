Personal Fitness Tracker 3.0
UPDATES (for the 3rd assignment)

PostgreSQL Integration:
Established a connection between the Java application and a PostgreSQL database using the JDBC API.

Database Access Layer:
Introduced a new WorkoutDAO class to encapsulate all SQL operations, including database connection handling and basic CRUD logic.

Relational Tables:
Created two database tables (users and workout_routines) to provide persistent data storage for fitness data.

Exception Handling:
Implemented safe database operations using try-catch blocks and try-with-resources to handle SQLException and ensure proper resource management.

Description

This project is a console-based Java application developed to demonstrate Object-Oriented Programming (OOP) principles integrated with a relational database management system.
The system manages fitness workout routines, supporting both in-memory processing (Assignment 2) and persistent storage using PostgreSQL (Assignment 3).

Technical Implementation
1. Database & Persistence

JDBC Connectivity:
Uses the PostgreSQL JDBC driver to communicate with the database server.

PreparedStatement:
Utilized for secure SQL execution and safe parameter handling.

Data Persistence:
Workout data is stored permanently in PostgreSQL tables instead of volatile memory.

2. Exception Handling

Database Errors:
Handles SQLException for connection issues, incorrect credentials, and SQL execution errors.

Resource Management:
Uses try-with-resources to automatically close database connections and statements.

3. Object-Oriented Programming Principles

Encapsulation:
All class fields are private or protected and accessed via public methods.

Inheritance:
CardioWorkout and StrengthWorkout inherit from the abstract class WorkoutRoutine.

Abstraction:
WorkoutRoutine defines abstract behavior for calorie calculation.

Polymorphism:
Different workout types provide their own implementations of calorie calculation via method overriding.

4. Data Management

In-Memory Processing:
FitnessApp manages workouts using collections, filtering, and sorting (Assignment 2).

Database Processing:
WorkoutDAO handles storing and retrieving workout data from PostgreSQL (Assignment 3).

Data Retrieval:
Workout records are fetched from the database and displayed in the console.

5. Standard Methods

Overridden toString(), equals(), and hashCode() methods in entity classes to ensure correct object representation and comparison.

Project Structure

Main.java – Entry point of the application; demonstrates Assignment 2 and Assignment 3 functionality.

FitnessApp.java – Manages in-memory workout logic (filtering, sorting).

WorkoutRoutine.java – Abstract base class for all workout types.

CardioWorkout.java – Cardio workout implementation.

StrengthWorkout.java – Strength workout implementation.

WorkoutDAO.java – Handles JDBC connection and SQL operations.

DatabaseConnection.java – Manages PostgreSQL connection configuration.

User.java – Entity class representing a system user.

How to Run

Database Setup:
Ensure PostgreSQL is running and create the required tables (users, workout_routines).

Add Library:
Include the postgresql-42.x.x.jar JDBC driver in the project dependencies.

Configure Connection:
Update the database URL, username, and password in DatabaseConnection.java.

Execute:
Run the Main class in IntelliJ IDEA and observe console output.

Student: Nurdaulet
Group: (укажи свою группу)
