
# Customer Service - GenLink Microservice

This Spring Boot microservice manages customer data for MSIG Insurance Malaysia’s GenLink platform.

---

## 🔧 Technologies Used

- Java 17+
- Spring Boot 3.4.5
- Spring Web
- Spring Data JPA
- Spring Validation (`@Valid`)
- Springdoc OpenAPI 3 (`2.8.5`)
- MapStruct
- Lombok
- MySQL (local)
- Maven

---

## 📁 Project Structure

```
customer-service/
├── controller/
├── service/
├── service/impl/
├── dto/
├── model/
├── mapper/
├── repository/
└── application.properties
```

---

## ⚙️ Configuration

### `application.properties`

```properties
server.port=8080

spring.datasource.url=jdbc:mysql://localhost:3306/genlink
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

springdoc.api-docs.path=/v3/api-docs
springdoc.swagger-ui.path=/swagger-ui.html
```

---

## 🧪 Swagger Documentation

Accessible at:

```
http://localhost:8080/swagger-ui.html
```

---

## 🧩 API Endpoints

| Method | Endpoint            | Description           |
|--------|---------------------|-----------------------|
| GET    | /api/customers      | List all customers    |
| GET    | /api/customers/{id} | Get customer by ID    |
| POST   | /api/customers      | Create new customer   |
| PUT    | /api/customers/{id} | Update customer       |
| DELETE | /api/customers/{id} | Delete customer       |

---

## 📦 Dependencies (in `pom.xml`)

```xml
<dependencies>
    <!-- Spring Boot Starters -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- MySQL JDBC -->
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
    </dependency>

    <!-- Swagger (Springdoc OpenAPI) -->
    <dependency>
        <groupId>org.springdoc</groupId>
        <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
        <version>2.8.5</version>
    </dependency>

    <!-- Lombok -->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <scope>provided</scope>
    </dependency>

    <!-- MapStruct -->
    <dependency>
        <groupId>org.mapstruct</groupId>
        <artifactId>mapstruct</artifactId>
        <version>1.5.5.Final</version>
    </dependency>
    <dependency>
        <groupId>org.mapstruct</groupId>
        <artifactId>mapstruct-processor</artifactId>
        <version>1.5.5.Final</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

---

## ✅ Build and Run

### Run via Maven
```bash
mvn clean install
mvn spring-boot:run
```

Ensure MySQL is running on port 3306 and database `genlink` is created.

---

## ✨ Tips

- Use `@Builder` on DTOs and Entities for easy object creation.
- Validate input using `@Valid` and `@NotNull`, `@Email`, etc.
- Use `@RestControllerAdvice` for global exception handling.

---

## ✅ License

This project is proprietary to MSIG Insurance Malaysia and is not open for external distribution.


##POSTMAN

