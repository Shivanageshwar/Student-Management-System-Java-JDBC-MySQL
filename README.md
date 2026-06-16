# Student Management System (Java JDBC + MySQL)

Simple console-based Student Management System using Java, JDBC, and MySQL.

## Project structure
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


