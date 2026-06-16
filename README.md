# Student Management System (Java JDBC + MySQL)

A console-based Student Management System developed using Java, JDBC, and MySQL. The application allows users to perform CRUD (Create, Read, Update, Delete) operations on student records through a menu-driven interface.

## Features

* Add Student
* View All Students
* Search Student by ID
* Update Student Details
* Delete Student Record
* MySQL Database Integration using JDBC
* Menu-Driven Console Application

## Technologies Used

* Java
* JDBC
* MySQL
* VS Code
* Git & GitHub

## Database Schema

```sql
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    cgpa DECIMAL(3,2)
);
```

## Project Structure

```text
Student-Management-System-Java-JDBC-MySQL/
├─ .gitignore
├─ README.md
├─ lib/
│  └─ mysql-connector-j-9.7.0.jar
└─ src/
   ├─ DBConnection.java
   ├─ Main.java
   ├─ Student.java
   └─ StudentDAO.java
```

## Concepts Implemented

* Object-Oriented Programming (OOP)
* Encapsulation
* Constructors
* JDBC Connectivity
* PreparedStatement
* ResultSet
* CRUD Operations
* SQL Queries
* Database Design

## Learning Outcomes

* Developed a complete Java application connected to MySQL.
* Learned JDBC for database communication.
* Implemented secure database operations using PreparedStatement.
* Applied OOP principles in a real-world project.
* Practiced database design and CRUD functionality.

## Future Enhancements

* GUI using Java Swing or JavaFX
* User Authentication
* Search by Name
* Export Student Records
* Advanced Validation

Simple console-based Student Management System using Java, JDBC, and MySQL.

## Project files
- `src/Main.java` - Console menu
- `src/Student.java` - Model
- `src/StudentDAO.java` - CRUD operations
- `src/DBConnection.java` - MySQL connection


## Notes
- Update MySQL credentials in `src/DBConnection.java` before running.
- Ensure the MySQL database/table exists (example table: `students`).

## Build & Run
Compile and run the `src/Main.java` entry point with your Java setup.


## Author

Shiva Nageshwar Rao
