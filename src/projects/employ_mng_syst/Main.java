package projects.employ_mng_syst;

import java.util.ArrayList;
import java.util.List;

interface SalaryCalculator {
    double calculateSalary();
}

enum EmployeeType {
    FULL_TIME,
    PART_TIME
}

class SalaryData {
    private double monthlySalary;
    private Double hrsWorked; // Optional
    private Double hrsRate; // Optional

    public SalaryData(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalaryData(double hrsWorked, double hrsRate) {
        this.hrsWorked = hrsWorked;
        this.hrsRate = hrsRate;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public Double getHrsWorked() {
        return hrsWorked;
    }

    public Double getHrsRate() {
        return hrsRate;
    }
}

abstract class Employee {
    private String name;
    private int id;
    private EmployeeType type;
    private SalaryData salaryData;

    public Employee(String name, int id, EmployeeType type, SalaryData salaryData) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.salaryData = salaryData;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public EmployeeType getType() {
        return type;
    }

    public SalaryData getSalaryData() {
        return salaryData;
    }
}

class FullTimeEmployee extends Employee implements SalaryCalculator {
    FullTimeEmployee(double monthlySalary, String name, int id) {
        super(name, id, EmployeeType.FULL_TIME, new SalaryData(monthlySalary));
    }

    @Override
    public double calculateSalary() {
        return getSalaryData().getMonthlySalary();
    }
}

class PartTimeEmployee extends Employee implements SalaryCalculator {
    PartTimeEmployee(Double hrsWorked, Double hrsRate, String name, int id) {
        super(name, id, EmployeeType.PART_TIME, new SalaryData(hrsWorked, hrsRate));
    }

    @Override
    public double calculateSalary() {
        Double hoursWorked = getSalaryData().getHrsWorked();
        Double hourlyRate = getSalaryData().getHrsRate();

        if (hoursWorked != null && hourlyRate != null) {
            return hoursWorked * hourlyRate;
        } else {
            // Handle cases where hourly rate or hours worked are null
            return 0.0; // Or implement a specific logic as needed
        }
    }
}

class PayRollSystem {
    List<Employee> employeeList;

    PayRollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void deleteEmployee(int id) {
        Employee empDeletable = null;
        for (Employee empList : employeeList) {
            if (empList.getId() == id) {
                empDeletable = empList;
                break;
            }
        }

        if (empDeletable != null) {
            employeeList.remove(empDeletable);
        }
    }

    public void displayEmployees() {
        for (Employee employee : employeeList) {
//            System.out.print(employee.getName() + " - Type: " + employee.getType() + " - Salary: " + employee.calculateSalary() + "\n");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PayRollSystem payRollSystem = new PayRollSystem();
        FullTimeEmployee fEmp1 = new FullTimeEmployee(50000, "Hariom Shah", 2);
        PartTimeEmployee pEmp1 = new PartTimeEmployee(5.0, 1000.0, "Santosh Shah", 1);
        payRollSystem.addEmployee(fEmp1);
        payRollSystem.addEmployee(pEmp1);

        // Display employees
        payRollSystem.displayEmployees();

        // Delete an employee (Uncomment and test)
        // payRollSystem.deleteEmployee(1);
        // payRollSystem.displayEmployees();
    }
}

