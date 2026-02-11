📌 Mini App – System Integration & Architecture
📖 Project Description

This project is a Mini App developed for the System Integration & Architecture laboratory activity.
It demonstrates a full-stack authentication system with the following features:

User Registration

User Login

Logout

Dashboard

Profile Page

The system uses:

A React (Vite) web frontend

A Spring Boot REST API backend

A MySQL database for storing users

Passwords are stored securely (not in plain text), and protected pages are only accessible after login.

Both Web and Mobile (future) clients are designed to connect to the same backend API.

🛠️ Technologies Used
Frontend (Web)

React JS (Vite)

React Router DOM

Axios

HTML, CSS, JavaScript

Backend (API)

Java Spring Boot

Spring Data JPA

MySQL

Hibernate

Maven

Database

MySQL (via XAMPP / MySQL Server)

⚙️ Steps to Run Backend (Spring Boot)

Open the backend project in IntelliJ / Eclipse

Make sure MySQL / XAMPP is running

Create a database (example):

CREATE DATABASE miniapp_db;


Check application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/miniapp_db
spring.datasource.username=root
spring.datasource.password=


Run:

mvn spring-boot:run


or run MiniappApplication.java in your IDE.

Backend should run at:

http://localhost:8080
