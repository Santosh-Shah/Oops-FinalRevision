package pay_roll_system;

abstract class Employee {
    private String name;
    private int id;
    private EmployeeType employeeType;
    private SalaryData salaryData;

    public Employee(String name, int id, EmployeeType employeeType, SalaryData salaryData) {
        this.name = name;
        this.id = id;
        this.employeeType = employeeType;
        this.salaryData = salaryData;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public SalaryData getSalaryData() {
        return salaryData;
    }
}
