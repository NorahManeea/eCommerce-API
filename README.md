# Ecommerce API using Java Spring Boot

This project is an API for an ecommerce application built using Java 17, Maven, Spring Boot, Lombok, JPA, Security, and PostgreSQL. It provides endpoints to manage users, products, orders, and carts.

## Prerequisites

Before running the application, ensure you have the following installed:

- Java 17
- Maven
- PostgreSQL
- Your favorite IDE (e.g., IntelliJ IDEA, Eclipse)

## Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/ecommerce-api.git
   cd ecommerce-api
2. Update the application.properties file in the src/main/resources directory with your PostgreSQL database configuration:
   ```bash
   spring.datasource.url=jdbc:postgresql://localhost:5432/ecommerce_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
3. Run the following Maven command to build the project and start the application:
   ```bash
   mvn spring-boot:run


## Usage

The API provides the following endpoints:

### Endpoints

- `/api/auth`: Endpoint for user authentication.
- `/api/users`: CRUD operations for managing users.
- `/api/products`: CRUD operations for managing products.
- `/api/orders`: Endpoints for managing orders.
- `/api/cart`: Endpoints for managing the shopping cart.


