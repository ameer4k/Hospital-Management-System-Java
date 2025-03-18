// Student Name : Ameer Khalili , Student Number : 1230881 , Lecture Section : 4 , Lab Section : 6L

class LongTermPatient extends PatientBase {
    private int daysAdmitted;
    private double dailyRate;

    public LongTermPatient(String patientId, String name, int age, String medicalHistory, Department department, int daysAdmitted, double dailyRate) {
        super(patientId, name, age, medicalHistory, department);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }


    public double calculateBill() {
        double serviceCosts = 0;
        for (HospitalService service : getServices()) {
            serviceCosts += service.getServiceCost();
        }
        return (daysAdmitted * dailyRate + serviceCosts) * (1 + Billable.TAX_RATE);
    }

    @Override
    public int compareTo(PatientBase o) {
        if (calculateBill() < o.calculateBill()) return 1;
        if (calculateBill() > o.calculateBill()) return -1;
        return 0;
    }
}