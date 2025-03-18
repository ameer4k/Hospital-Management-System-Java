// Student Name : Ameer Khalili , Student Number : 1230881 , Lecture Section : 4 , Lab Section : 6L


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Driver {

    public static void main(String[] args) {
        Department Teeth = new Department("D1", "Teeth");
        Department Heart = new Department("D2", "Heart");
        Department Legs = new Department("D3", "Legs");

        EmergencyPatient patient1 = new EmergencyPatient("P1", "Khalid", 30, "Teeth issues", Teeth, 500);
        LongTermPatient patient2 = new LongTermPatient("P2", "Ramiz", 60, "Heart", Heart, 20, 200);
        EmergencyPatient patient3 = new EmergencyPatient("P3", "Mohammad", 45, "Broken leg", Legs, 300);

        ArrayList<PatientBase> patients = new ArrayList<>();
        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);

        Doctor doctor1 = new Doctor("D1", "Dr. Ahmad", "Teeth", "phd", 5000, 10, 50, Teeth);
        Doctor doctor2 = new Doctor("D2", "Dr. Ameer", "Heart", "master", 4000, 8, 40, Heart);

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(doctor1);
        doctors.add(doctor2);

        Teeth.addDoctor(doctor1);
        Heart.addDoctor(doctor2);
        Teeth.addPatient(patient1);
        Heart.addPatient(patient2);
        Legs.addPatient(patient3);

        HospitalService service1 = new HospitalService("A", 200, patient1);
        HospitalService service2 = new HospitalService("B", 1000, patient2);
        HospitalService service3 = new HospitalService("C", 300, patient3);

        patient1.getServices().add(service1);
        patient2.getServices().add(service2);
        patient3.getServices().add(service3);

        generateBill(patient3);

        sortDoctorsBySalary(doctors);

        System.out.println("\nsorted Doctors department’s names and salaries:");
        for (Doctor doctor : doctors) {
            System.out.println("department name " + doctor.getDepartment().getName() + ": " + "salary " + doctor.calculateSalary());
        }

        Collections.sort(patients);

        System.out.println("\nsorted patients by bill amount and sorted Patient names and age");
        for (PatientBase patient : patients) {
            System.out.println("Name: " + patient.getName() + ", Age: " + patient.getAge());
        }

        System.out.println("\ntotal sum of all patients Bill: " + calculateTotalpatientsBill(patients));
    }
    public static void sortDoctorsBySalary(ArrayList<Doctor> doctors) {
        Collections.sort(doctors);
    }

    public static double calculateTotalpatientsBill(ArrayList<PatientBase> patients) {
        double totalBill = 0;
        for (PatientBase patient : patients) {
            totalBill += patient.calculateBill();
        }
        return totalBill;
    }

    public static void generateBill(PatientBase patient) {
        System.out.println("Patient ID: " + patient.getPatientId());
        System.out.println("Name: " + patient.getName());
        System.out.println("Total Bill Amount: " + patient.calculateBill());
    }

}