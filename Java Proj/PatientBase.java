
// Student Name : Ameer Khalili , Student Number : 1230881 , Lecture Section : 4 , Lab Section : 6L

import java.util.ArrayList;

public abstract class PatientBase implements Billable, Comparable<PatientBase> {
    private String patientId;
    private String name;
    private int age;
    private String medicalHistory;
    private Department department;
    private ArrayList<HospitalService> services = new ArrayList<>();

    public PatientBase(String patientId, String name, int age, String medicalHistory, Department department) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
        this.department = department;
    }



    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ArrayList<HospitalService> getServices() {
        return services;
    }
    @Override
    public abstract double calculateBill();
    @Override
    public int compareTo(PatientBase o) {
        if (calculateBill() < o.calculateBill()) return 1;
        if (calculateBill() > o.calculateBill()) return -1;
        return 0;
    }


    @Override
    public String toString() {
        return "PatientBase{" + "patientId='" + patientId + '\'' + ", name='" + name + '\'' + ", age=" + age + ", medicalHistory='" + medicalHistory + '\'' + ", department=" + department + ", services=" + services + '}';
    }
}