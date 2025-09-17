## Tech Stack
- *Programming Language*: Java
- *Framework*: Spring Boot
- *ORM Tool*: Hibernate
- *Database*: MySQL
- *Build Tool*: Maven
- *IDE*:  Eclipse
- *Testing Tools*:  Postman (for API testing)


# Edutrack (Classroom and Attendence Management System) Web Application

This is a EduTrack web-based  application implemented in Java using Springboot and hibernate .

## Features
- *Student Attendance Tracking*: Easily manage and track student attendance records for each class.
- *Classroom Management*: Maintain records of class schedules, subjects, and instructors.
- *RESTful APIs*: Seamless integration of the system with other platforms through REST APIs.
- *Secure Authentication*: User authentication and role-based access control using Spring Security.
- *Responsive User Interface*: Optimized for usability with a clean interface.

## Setup

### Prerequisites
Ensure that you have the following tools installed on your local machine:
- Java 8 or higher
- Maven
- MySQL

### Steps to Run the Project

1. *Clone the repository*:
    bash
    git clone https://github.com/omborhade/EduTrack--SpringBoot.git
    cd EduTrack--SpringBoot
    

2. *Configure the MySQL Database*:
   - Create a MySQL database:
     sql
     CREATE DATABASE edutrack_db;
     
   - Update the database connection details in the application.properties file:
     properties
     spring.datasource.url=jdbc:mysql://localhost:3306/edutrack_db
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     

3. *Build and run the project*:
    bash
    mvn clean install
    mvn spring-boot:run
    

4. *Access the application*:
   - Open your browser and go to http://localhost:8080 to interact with the system.

## API Endpoints

Here are some of the key REST APIs provided by the system:

- *Attendance APIs*:
    - POST /api/attendance: Mark attendance for a class.
    - GET /api/attendance/{classId}: Get attendance records for a class.

- *Classroom APIs*:
    - POST /api/classroom: Create a new classroom.
    - GET /api/classroom/{id}: Retrieve details of a specific classroom.
    - PUT /api/classroom/{id}: Update classroom details.
    - DELETE /api/classroom/{id}: Delete a classroom.

## Usage

1. *Login*: Sign in with administrator credentials to access the management dashboard.
2. *Manage Attendance*: Use the dashboard to view and update student attendance.
3. *Manage Classrooms*: Create and manage classroom schedules and student assignments.
4. *API Usage*: Use tools like Postman to test the REST APIs for classroom and attendance management.

## Future Enhancements
- *Student Report Generation*: Automatically generate attendance reports for students.
- *Mobile App Integration*: Provide a mobile interface for students and teachers.
- *Notifications*: Implement notifications to alert students and staff about upcoming classes or low attendance.

## Contributing
We welcome contributions from the community! Please feel free to fork the repository, submit issues, or create pull requests.
