
# MAS Project

## Overview
This project is a Medical Appointment System (MAS) designed to manage appointments, doctors, and patients. It includes user authentication, appointment scheduling, and a database schema for managing the necessary data.

## Features
- User Authentication: Custom user authentication system using BCrypt for password encryption.
- CRUD Operations: Manage Patients, Doctors, Doctor Availabilities, and Appointments.
- RESTful API: Built with Spring Boot to handle requests and manage the database.
- Database: MySQL is used for storing user, doctor, patient, and appointment data.

## Prerequisites
- Java 17 or above
- Maven 3.6.3 or above
- MySQL 8.0 or above

## Getting Started

### Clone the repository
```bash
git clone https://github.com/yourusername/mas-project.git
cd mas-project
```

### Configure the Database
Ensure you have MySQL running and update the `application.properties` file with your database credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/MAS
spring.datasource.username=your-username
spring.datasource.password=your-password
```

### Run Database Scripts
Execute the SQL scripts provided in the `database` directory to set up the required tables.

### Build the Project
```bash
./mvnw clean install
```

### Run the Application
```bash
./mvnw spring-boot:run
```

### API Endpoints
- `/api/authenticate`: Authenticate a user.
- `/api/patients`: Manage patients.
- `/api/doctors`: Manage doctors.
- `/api/doctor-availability`: Manage doctor availability.
- `/api/appointments`: Manage appointments.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
This project is licensed under the MIT License.
