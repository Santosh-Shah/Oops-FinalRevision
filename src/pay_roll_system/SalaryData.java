package pay_roll_system;

public class SalaryData {
    private double monthlySalary;
    private double hrsWorked;
    private double hrsRate;

    public SalaryData(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalaryData(double hrsWorked, double hrsRate) {
        this.hrsRate = hrsRate;
        this.hrsWorked = hrsWorked;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getHrsWorked() {
        return hrsWorked;
    }

    public double getHrsRate() {
        return hrsRate;
    }
}
