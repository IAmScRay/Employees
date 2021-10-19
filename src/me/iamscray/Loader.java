package me.iamscray;

public class Loader {

    public static void main(String[] args) {
        Employee[] employees = EmployeeFactory.generateEmployees(10);

        EmployeeService service = new EmployeeService(employees);

        for(Employee e : service.getEmployees()) {
            System.out.println(e);
        }
        System.out.println("Number of employees: " + service.getEmployees().length + "\n");

        service.addEmployee(new Employee(20L, "Pasha", "Male", 20, 15000D, 5, 100));

        for(Employee e : service.getEmployees()) {
            System.out.println(e);
        }
        System.out.println("Number of employees (after adding one employee): " + service.getEmployees().length + "\n");

        Employee firedEmployee = service.removeEmployee(20L);
        if(firedEmployee != null) {
            System.out.println(firedEmployee + "\n");
        } else {
            System.out.println("No employee was found & fired!");
        }

        for(Employee e : service.getEmployees()) {
            System.out.println(e);
        }
        System.out.println("Number of employees (after firing one): " + service.getEmployees().length + "\n");
    }
}
