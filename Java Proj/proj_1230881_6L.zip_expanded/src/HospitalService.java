// Student Name : Ameer Khalili , Student Number : 1230881 , Lecture Section : 4 , Lab Section : 6L

class HospitalService {
    private String serviceName;
    private double serviceCost;
    private PatientBase patient;

    public HospitalService(String serviceName, double serviceCost, PatientBase patient) {
        this.serviceName = serviceName;
        this.serviceCost = serviceCost;
        this.patient = patient;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public PatientBase getPatient() {
        return patient;
    }

    public void setPatient(PatientBase patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "HospitalService{" + "serviceName='" + serviceName + '\'' + ", serviceCost=" + serviceCost + ", patient=" + patient + '}';
    }
}