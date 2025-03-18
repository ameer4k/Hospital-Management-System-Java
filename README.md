Hospital Management System
A Java application that models a hospital management system with departments, doctors, patients, and hospital services.
Project Overview
This project implements a hospital management system using object-oriented programming concepts in Java. The system includes:

Management of departments
Doctor information and salary calculation
Different types of patients (Emergency and Long-Term)
Hospital services and billing

Classes and Interfaces

Billable: Interface for billing calculations
Department: Manages doctors and patients in a specific department
Doctor: Represents a doctor with specialty and salary calculation
PatientBase: Abstract class for patient information
EmergencyPatient: Extends PatientBase for emergency cases
LongTermPatient: Extends PatientBase for long-term hospital stays
HospitalService: Represents services provided to patients
Driver: Main class that demonstrates the functionality

Features

Doctor salary calculation based on degree and overtime
Patient billing based on patient type and services
Department management
Sorting doctors by salary
Sorting patients by bill amount
Generating bills for patients

How to Run

Clone the repository
Open the project in your Java IDE
Run the Driver.java file to see the system in action

Sample Output
CopyPatient ID: P3
Name: Mohammad
Total Bill Amount: 600.0

sorted Doctors department's names and salaries:
department name Teeth: salary 6650.0
department name Heart: salary 5120.0

sorted patients by bill amount and sorted Patient names and age
Name: Ramiz, Age: 60
Name: Khalid, Age: 30
Name: Mohammad, Age: 45

total sum of all patients Bill: 5500.0
Author
Ameer Khalili
