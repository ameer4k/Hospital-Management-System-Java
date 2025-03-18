// Student Name : Ameer Khalili , Student Number : 1230881 , Lecture Section : 4 , Lab Section : 6L

class EmergencyPatient extends PatientBase {
    private double emergencyFee;

    public EmergencyPatient(String patientId, String name, int age, String medicalHistory, Department department, double emergencyFee) {
        super(patientId, name, age, medicalHistory, department);
        this.emergencyFee = emergencyFee;
    }

    @Override
    public double calculateBill() {
        double serviceCosts = 0;
        for (HospitalService service : getServices()) {
            serviceCosts += service.getServiceCost();
        }
        return emergencyFee + serviceCosts * (1 + Billable.TAX_RATE);
    }

    @Override
    public int compareTo(PatientBase o) {
        if (calculateBill() < o.calculateBill()) return 1;
        if (calculateBill() > o.calculateBill()) return -1;
        return 0;
    }
}