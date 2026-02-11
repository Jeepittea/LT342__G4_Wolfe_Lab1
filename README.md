📌 MiniApp – Simple Auth System (Lab Project)
📖 Project Description

This project is a simple authentication system built for our System Integration & Architecture lab activity.

It demonstrates:

User registration

User login

Basic REST API using Spring Boot

A web frontend (React + Vite) that will consume the API

Data storage using MySQL

⚠️ For now, passwords are stored in plain text (for school/demo purposes only).

🛠️ Tech Stack
Backend

Java

Spring Boot

Spring Data JPA (Hibernate)

MySQL

Maven

Web (Frontend)

React (Vite)

JavaScript

HTML, CSS

Node.js / npm

📂 Project Structure
LT342_G4_Wolfe_Lab1/
 ├── Backend/        (Spring Boot backend)
 ├── web/            (React frontend)
 ├── Docs/
 ├── README.md
 └── TASKLIST.md

⚙️ Database Setup (MySQL)

Open phpMyAdmin or MySQL client

Create a database:

CREATE DATABASE miniapp_db;


Make sure your application.properties (or application.yml) contains something like:

spring.datasource.url=jdbc:mysql://localhost:3306/miniapp_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


Run the backend once — Hibernate will auto-create the tables.

▶️ How to Run Backend (Spring Boot)

Open the Backend project in IntelliJ

Make sure MySQL (XAMPP) is running

Open:

MiniappApplication.java


Click Run ▶️

If successful, you should see in logs:

Tomcat started on port(s): 8080


Backend will run at:

http://localhost:8080

▶️ How to Run Web (React)

Open PowerShell / Terminal

Go to the web folder:

cd LT342_G4_Wolfe_Lab1\web


Install dependencies (first time only):

npm install


Start the dev server:

npm run dev


Open the shown URL (usually):

http://localhost:5173

🔧 Environment / Config Notes
Backend

Port: 8080

Database: miniapp_db

Config file:
src/main/resources/application.properties

Web

API Base URL (example):

http://localhost:8080/api


Make sure your frontend uses the correct backend URL.

🔌 API Endpoints

Base path:

/api/auth

✅ Register User

POST /api/auth/register

Body (JSON):

{
  "username": "justin",
  "password": "123456"
}


Response:

200 OK → User registered successfully

400 Bad Request → Username already exists

✅ Login User

POST /api/auth/login

Body (JSON):

{
  "username": "justin",
  "password": "123456"
}


Response:

200 OK → Login successful

401 Unauthorized → Invalid username or password

🧪 Testing the API

You can use:

Postman

Thunder Client

Or any REST client

Example URL:

http://localhost:8080/api/auth/login

📌 Notes

This project is for educational purposes

Passwords are not encrypted yet

Future improvements:

Password hashing

JWT authentication

Role-based access

Better UI
