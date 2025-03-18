
// Student Name : Ameer Khalili , Student Number : 1230881 , Lecture Section : 4 , Lab Section : 6L

class Doctor implements Comparable<Doctor> {
    private String doctorId;
    private String name;
    private String specialty;
    private String degree;
    private double baseSalary;
    private double overtimeHours;
    private double overtimeRate;
    private Department department;

    public Doctor(String doctorId, String name, String specialty, String degree, double baseSalary, double overtimeHours, double overtimeRate, Department department) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialty = specialty;
        this.degree = degree;
        this.baseSalary = baseSalary;
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
        this.department = department;
    }

    public double calculateSalary() {
        double degreeBonus = 0.0;
        if ("bachelor".equalsIgnoreCase(degree)) {
            degreeBonus = 0.1;
        } else if ("master".equalsIgnoreCase(degree)) {
            degreeBonus = 0.2;
        } else if ("phd".equalsIgnoreCase(degree)) {
            degreeBonus = 0.3;
        }
        return baseSalary * (1 + degreeBonus) + calculateOvertimePay();
    }

    public double calculateOvertimePay() {
        return overtimeHours * overtimeRate;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Doctor{" + "doctorId='" + doctorId + '\'' + ", name='" + name + '\'' + ", specialty='" + specialty + '\'' + ", degree='" + degree + '\'' + ", baseSalary=" + baseSalary + ", overtimeHours=" + overtimeHours + ", overtimeRate=" + overtimeRate + ", department=" + department + '}';
    }


    @Override
    public int compareTo(Doctor o) {
        if (calculateSalary() < o.calculateSalary()) return 1;
        if (calculateSalary() > o.calculateSalary()) return -1;
        return 0;
    }
}