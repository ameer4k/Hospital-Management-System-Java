// Student Name : Ameer Khalili , Student Number : 1230881 , Lecture Section : 4 , Lab Section : 6L

import java.util.ArrayList;

class Department {
    private String departmentId;
    private String name;
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<PatientBase> patients = new ArrayList<>();

    public Department(String departmentId, String name) {
        this.departmentId = departmentId;
        this.name = name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(PatientBase patient) {
        patients.add(patient);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Department{" + "departmentId='" + departmentId + '\'' + ", name='" + name + '\'' + ", doctors=" + doctors + ", patients=" + patients + '}';
    }
}