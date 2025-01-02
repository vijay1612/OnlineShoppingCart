# E-commerce Web Application

This is an e-commerce web application designed for users to browse and purchase perfumes online. It allows users to register, manage accounts, view orders, and track their order statuses. Admins can manage users, perfumes, and orders via a secure backend system.

Features
	•	User Authentication: User registration, login, password reset, and account activation using email.
	•	Order Management: Users can add perfumes to their cart, place orders, and track the status of their orders.
	•	Admin Panel: Admins can manage perfumes, edit perfume details, and view all user orders.
	•	Search & Filters: Perfumes can be filtered by various attributes such as fragrance, gender, price, and more.
	•	Security: The application uses BCrypt encryption for password storage and Spring Security for authentication and role-based authorization.

Tech Stack
	•	Backend: Spring Boot, Java
	•	Database: PostgreSQL
	•	Frontend: Thymeleaf, Bootstrap (for admin pages)
	•	Security: Spring Security, BCrypt
	•	Other Libraries: ModelMapper for object mapping, JavaMailSender for email functionalities

Getting Started

Prerequisites
	1.	Java 11 or above
	2.	Maven
	3.	PostgreSQL
	4.	Git

Installation
	1.	Clone the repository:
 git clone https://github.com/vijay1612/onlineShoppingCart.git
 	2.	Set up the database:
	 •	Create a PostgreSQL database and configure the connection in the application.properties file.
     spring.datasource.url=jdbc:postgresql://localhost:5432/ecommerce_db
     spring.datasource.username=your_db_username
     spring.datasource.password=your_db_password
	3.	Build and run the project:
      mvn clean install
      mvn spring-boot:run
  4.	Access the application via http://localhost:8080.
  Database Configuration
	•	Users: Stores user details (email, password, roles, etc.)
	•	Orders: Stores order information including perfumes, user details, and shipping address.
	•	Perfumes: Stores information about perfumes (title, year, description, etc.).

Endpoints

User Endpoints
	•	/login: User login page
	•	/registration: User registration page
	•	/user/account: User profile page
	•	/user/orders: List of user orders
	•	/user/info/edit: Edit user profile

Admin Endpoints
	•	/admin/perfumes: Manage perfumes
	•	/admin/users: View and manage users
	•	/admin/orders: View all orders

Perfume Endpoints
	•	/perfume/{id}: View details of a specific perfume
	•	/perfume/search: Search perfumes with filters

Security

This application uses Spring Security to secure user data and provide role-based access control. Users must authenticate to access their account details, view orders, and make purchases. Admins can manage perfumes and users.
	•	User Roles:
	•	USER: Can browse perfumes, place orders, and manage their account.
	•	ADMIN: Can manage perfumes, orders, and users.

Error Handling

The application provides custom error messages and redirects for common issues such as:
	•	Invalid email or password
	•	Account activation required
	•	Perfume not found
	•	Order not found

Contribution

Contributions are welcome! Please fork the repository, make your changes, and submit a pull request. When submitting a pull request, please ensure that you have:
	•	Written tests for any new functionality.
	•	Ensured the application runs correctly and all existing tests pass.
