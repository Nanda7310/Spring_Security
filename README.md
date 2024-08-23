Spring Security with JWT

This project demonstrates how to implement authentication and authorization in a Spring Boot application using Spring Security and JSON Web Tokens (JWT).
Features

    JWT-based Authentication: Users are authenticated by issuing a JWT after successfully logging in. This token is then included in the HTTP headers for subsequent requests to verify the user’s identity.
    Role-based Authorization: Controls access to various API endpoints by assigning roles and verifying them against JWT claims.
    Secure API Endpoints: Uses Spring Security filters to protect sensitive routes by requiring a valid JWT for access.
    User Management: Includes user registration and login features with encrypted passwords using BCrypt.

Technologies Used

    Spring Boot
    Spring Security
    JWT (JSON Web Tokens)
    H2 Database (or any other database)
    BCrypt for password hashing

How It Works

    User Authentication: Users authenticate via login, and upon successful authentication, a JWT is generated and returned to the client.
    JWT Validation: Each subsequent request includes the JWT in the Authorization header. Spring Security filters validate the token to ensure its authenticity and extract the user's details.
    Access Control: Based on user roles, access to API endpoints is restricted. Unauthorized requests will return a 401 Unauthorized error.

Setup Instructions

    Clone the repository.
    Build and run the project with Maven/Gradle.
    Use the provided API endpoints for registration, login, and accessing protected resources.
