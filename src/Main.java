import java.util.ArrayList;

abstract class Employee {
        private String name;
        private int id;

        public Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public abstract double calculateSalary();

        @Override
        public String toString() {
            return "Employee [Name = " + name + " Id = " + id + " Salary = " + calculateSalary() + "]\n";
        }
    }

    class FullTimeEmployee extends Employee {
        private double monthlySalary;

        FullTimeEmployee(double monthlySalary, String name, int id) {
            super(name, id);
            this.monthlySalary = monthlySalary;
        }

        @Override
        public double calculateSalary() {
            return monthlySalary;
        }
    }

    class PartTimeEmployee extends Employee {
        private double hrsWorked;
        private double hrsRate;

        PartTimeEmployee(double hrsWorked, double hrsRate, String name, int id) {
            super(name, id);
            this.hrsWorked = hrsWorked;
            this.hrsRate = hrsRate;
        }

        @Override
        public double calculateSalary() {
            return hrsRate * hrsWorked;
        }
    }

    class PayRollSystem {
        ArrayList<Employee> employeeList;

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
                System.out.print(employee + " ");
            }
        }
    }

public class Main {
    public static void main(String[] args) {
        PayRollSystem payRollSystem = new PayRollSystem();
        FullTimeEmployee fEmp1 = new FullTimeEmployee(50000, "Hariom Shah", 2);
        PartTimeEmployee pEmp1 = new PartTimeEmployee(5, 1000, "Santosh Shah", 1);
        payRollSystem.addEmployee(fEmp1);
        payRollSystem.addEmployee(pEmp1);
//        payRollSystem.displayEmployees();

//        payRollSystem.deleteEmployee(1);
        payRollSystem.displayEmployees();
    }
}