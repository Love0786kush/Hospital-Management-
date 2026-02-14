**🏥 Hospital Management REST API**
This project is a Hospital Management System built using Spring Boot and MySQL Database. It provides a robust backend REST API to manage hospital operations efficiently. The system is designed with a modular architecture ensuring scalability, maintainability, and security.
**🔑 Key Features**
- Patient Management – Add, update, view, and delete patient records with medical history.
- Doctor Management – Maintain doctor profiles, specialization, and availability schedules.
- Appointment Scheduling – REST endpoints for booking, rescheduling, and canceling appointments.
- Billing System – Generate and manage patient bills with CRUD operations.
- Authentication & Authorization – Secure login system using Spring Security and JWT.
- Database Integration – MySQL schema with normalized tables ensuring data integrity.
- Error Handling & Validation – Custom exception handling and input validation for reliability.
**🛠️ Tech Stack**
- Backend Framework: Spring Boot (REST API)
- Database: MySQL (with proper schema design, foreign keys, timestamps)
- ORM: Hibernate / JPA
- Security: Spring Security + JWT
- Tools: Maven, Postman (for API testing)
**📊 Database Schema Overview**
- Patients Table – patient_id, name, age, gender, contact, medical_history
- Doctors Table – doctor_id, name, specialization, availability
- Appointments Table – appointment_id, patient_id, doctor_id, date, status
- Bills Table – bill_id, patient_id, amount, date, payment_status
**🚀 Benefits**
- Streamlined hospital operations with centralized data.
- Easy integration with frontend dashboards (React, Angular, JSP).
- Scalable design for future modules like pharmacy, lab tests, and staff management.
