# Thymeleaf with Spring Boot

This project demonstrates the integration of **Thymeleaf** template engine with **Spring Boot** to build dynamic web applications.

---

## Features

- Spring Boot backend with REST and MVC support
- Thymeleaf templates for dynamic HTML rendering
- CRUD operations using Spring Data JPA
- MySQL database integration (or H2 for in-memory testing)
- Lombok to reduce boilerplate code
- DevTools enabled for live reload during development

---

## Technologies Used

- Java 17
- Spring Boot 3.5.6
- Spring Data JPA
- Thymeleaf
- MySQL / H2 Database
- Maven
- Lombok
- Spring Boot DevTools

---



src/
 ├─ main/
 │   ├─ java/com/example/demo/
 │   │   ├─ appController
 │   └─ resources/
 │       ├─ templates/       # Thymeleaf HTML templates
 │       ├─ static/          # CSS, JS, images
 │       └─ application.properties
 └─ test/
     └─ java/com/example/demo/Revision10ApplicationTests.java



in templates make a file named as test.html
copy the app controller and call "test" 
