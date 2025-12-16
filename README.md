# JDBC_TASK_1

# JDBC_TASK_1

# JDBC Oracle 10g Connection Test
This is a basic Java project created to test database connectivity between a Java application and an Oracle 10g database using JDBC.
The program loads the Oracle JDBC driver, establishes a connection, and prints "Connection Successful!" when everything works correctly.

## Objective
Load Oracle JDBC driver
Connect Java to Oracle 10g using JDBC
Print a success message
Handle exceptions and close the connection
## Technologies Used
Java (JDK)
Oracle 10g Database
Oracle JDBC Driver (ojdbc14.jar)

## Steps Performed
1.Loaded Oracle JDBC driver using Class.forName().
2.Created a database connection using DriverManager.getConnection().
3.Printed "Connection Successful!" if the connection opened properly.
4.Closed the connection after testing.
5. Added exception handling for ClassNotFoundException and SQLException.
## Project Structure
# src/
    └── Jdbcconnection.java
# lib/
    └── ojdbc17.jar

## How to Run
1. Place the JDBC Driver
Download and place the Oracle JDBC driver inside the lib folder.

2. Update DB Credentials
Update the database URL, username, and password inside the Java file.

3. Compile and Run

## Expected Output

Connection Successful
