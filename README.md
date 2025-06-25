# 🧑‍💼 Employee Management System - Spring Boot REST API

This is a simple Employee Management System built using **Java**, **Spring Boot**, and **MySQL**. It provides a RESTful API to perform basic **CRUD operations** (Create, Read, Update, Delete) on employee data.

The project demonstrates the use of layered architecture (Controller, Service, Repository), proper exception handling, and standard coding practices — suitable for beginners and those building their Java backend portfolio.

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman (for API testing)
- Git & GitHub

---

## ✨ Features

- Add new employee
- Get all employees
- Get employee by ID
- Update employee details
- Delete employee
- Proper error handling with meaningful messages
- Clean layered architecture: Controller → Service → Repository

## 📬 API Endpoints

Base URL: `http://localhost:8080/api/employees`

| Method | Endpoint               | Description             |
|--------|------------------------|-------------------------|
| GET    | `/`                    | Get all employees       |
| GET    | `/{id}`                | Get employee by ID      |
| POST   | `/`                    | Create new employee     |
| PUT    | `/{id}`                | Update employee by ID   |
| DELETE | `/{id}`                | Delete employee by ID   |

### 📌 Sample JSON for POST & PUT

```json
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com"
}
```

## 🚀 How to Run the Project Locally

### Prerequisites
- Java 17+
- Maven
- MySQL
- IDE (IntelliJ, Eclipse, or VS Code)

### 🧰 Steps

1. **Clone the repository**

```bash
git clone https://github.com/your-username/employee-management.git
cd employee-management
```

2. **Create MySQL Database**

Make sure MySQL is running. Then, create a database using the following SQL:

```sql
CREATE DATABASE employee_db;
```
3. **Update `application.properties`**

Go to the file:  
`src/main/resources/application.properties`  
and update it with your MySQL credentials:

```properties
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
```
# JPA Configuration
```
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```
4. **Run the Application**

Use the terminal to run the Spring Boot app:

```bash
./mvnw spring-boot:run
```
## 🧪 Step 5: Test the APIs

Once the application is running, you can test the REST endpoints using Postman, curl, or any API testing tool.

**Base URL**:
```
http://localhost:8080/api/employees
```
### ✅ Example Requests

```http
GET /api/employees

GET /api/employees/1

POST /api/employees
Content-Type: application/json
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com"
}

PUT /api/employees/1
Content-Type: application/json
{
  "firstName": "Jane",
  "lastName": "Smith",
  "email": "jane.smith@example.com"
}

DELETE /api/employees/1
```
## 📁 Project Folder Structure
```
employee-management/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.example.employeemanagement/
│   │   │       ├── controller/
│   │   │       ├── entity/
│   │   │       ├── repository/
│   │   │       ├── service/
│   │   │       └── EmployeeManagementApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── ...
├── pom.xml
└── README.md
```

## 🙋‍♂️ Author

**Bhaskar Mallineni**

- 🔗 GitHub: [https://github.com/BhaskarMallineni125](https://github.com/BhaskarMallineni125)
- 💼 LinkedIn: [https://www.linkedin.com/in/mallineni-bhaskar-660940248/](https://www.linkedin.com/in/mallineni-bhaskar-660940248/)

---

## 📌 License

This project is licensed under the MIT License - you are free to use, modify, and distribute it.
