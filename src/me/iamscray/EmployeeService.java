package me.iamscray;

import java.util.Arrays;

public class EmployeeService {

    private Employee[] employees;

    public EmployeeService() {}

    public EmployeeService(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Employee getByID(long id) {
        for(Employee employee : employees) {
            if(employee.getID() == id) {
                return employee;
            }
        }

        return null;
    }

    public Employee getByName(String name) {
        for(Employee employee : employees) {
            if(employee.getName().equals(name)) {
                return employee;
            }
        }

        return null;
    }

    public void printEmployees() {
        for(Employee e : employees) {
            System.out.println(e);
        }
        System.out.print("\n");
    }

    public double calculateSalaryAndBonus() {
        double result = 0;

        for(Employee employee : employees) {
            result += employee.getSalary() + (employee.getDefaultBugRate() * employee.getFixedBugs());
        }

        return result;
    }

    public void sortByName() {
        Arrays.sort(employees, Employee::compareByName);
    }

    public void sortByNameAndSalary() {
        Arrays.sort(employees, Employee::compareByNameAndSalary);
    }

    public void addEmployee(Employee employee) {
        Employee[] result = Arrays.copyOf(employees, employees.length + 1);
        result[result.length - 1] = employee;

        employees = result;
    }

    public Employee removeEmployee(long id) {
        int index = -1;

        for(int i = 0; i < employees.length; i++) {
            if(employees[i].getID() == id) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            return null;
        }

        Employee result = employees[index];
        employees[index] = null;

        employees = Arrays.copyOf(employees, employees.length - 1);

        return result;
    }

    public Employee editEmployee(Employee newE) {
        int index = -1;

        for(int i = 0; i < employees.length; i++) {
            if(employees[i].getID() == newE.getID()) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            return null;
        }

        Employee oldE = employees[index];
        employees[index] = newE;

        return oldE;
    }

}
