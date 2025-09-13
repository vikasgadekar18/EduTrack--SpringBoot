EduTrack - Attendance & Classroom Management System

EduTrack is a Spring Boot-based application designed to streamline attendance tracking and classroom management processes. 
It offers a user-friendly interface for educators and administrators to efficiently manage student attendance, course schedules, and related activities.

Features

Role-Based Access Control: Secure login with distinct roles for Admin and Instructor.

Attendance Management: Record and track student attendance for each class session.

Course Scheduling: Organize and manage course schedules and timings.

Student Enrollment: Enroll students into courses and monitor their progress.

Real-Time Notifications: Notify students and instructors about attendance status and updates.

Tech Stack

Backend: Spring Boot

Authentication: JWT (JSON Web Token)

Database: MySQL

Build Tool: Maven

Testing: JUnit, Mockito

Dependency Injection: Spring Framework

Setup Instructions
Prerequisites

Java 17 or higher

Maven 3.8+

MySQL 8+

IDE: IntelliJ IDEA, Eclipse, or Spring Tool Suite

Clone the Repository
git clone https://github.com/vikasgadekar18/EduTrack--SpringBoot.git
cd EduTrack--SpringBoot

Configure Database

Create a new MySQL database named edutrack.

Import the schema from src/main/resources/schema.sql to set up the necessary tables.

Application Properties

Update the application.properties file located in src/main/resources/ with your database credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/edutrack
spring.datasource.username=your_username
spring.datasource.password=your_password

Run the Application

Use Maven to run the application:

./mvnw spring-boot:run


Alternatively, you can run the EduTrackApplication class directly from your IDE.

API Endpoints
Authentication

POST /auth/login: Authenticate and retrieve a JWT.

Attendance

GET /attendance: Fetch all attendance records (Admin/Instructor only).

POST /attendance: Record attendance for a class session (Instructor only).

Courses

GET /courses: Fetch all courses (Admin/Instructor only).

POST /courses: Create a new course (Admin only).

PUT /courses/{id}: Update course details (Instructor/Admin only).

Enrollments

GET /enrollments: Fetch all enrollments (Admin only).

POST /enrollments: Enroll a student in a course (Admin only).

Users

GET /users: Fetch all users (Admin only).

POST /users: Create a new user (Admin only).

Project Structure
src
├── main
│   ├── java
│   │   └── com.edutrack
│   │       ├── controller       # REST controllers
│   │       ├── dto              # Data Transfer Objects
│   │       ├── entity           # Database entity models
│   │       ├── repository       # JPA Repositories
│   │       ├── service          # Business logic
│   │       └── util             # Utility classes
│   └── resources
│       ├── application.properties # Configuration
│       └── schema.sql             # Database schema
└── test
    └── java
        └── com.edutrack          # Unit and integration tests

License

This project is licensed under the MIT License. See the LICENSE file for details.
