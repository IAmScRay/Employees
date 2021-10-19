package me.iamscray;

import java.util.Comparator;

public class Employee {

    private long id;
    private String name;

    private String gender;
    private int age;

    private double salary;
    private int fixedBugs;
    private int defaultBugRate;

    public Employee() {}

    public Employee(long id, String name, String gender, int age, double salary, int fixedBugs, int defaultBugRate) {
        this.id = id;
        this.name = name;

        this.gender = gender;
        this.age = age;

        this.salary = salary;
        this.fixedBugs = fixedBugs;
        this.defaultBugRate = defaultBugRate;
    }

    public long getID() {
        return id;
    }

    public void setID(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getFixedBugs() {
        return fixedBugs;
    }

    public void setFixedBugs(int fixedBugs) {
        this.fixedBugs = fixedBugs;
    }

    public int getDefaultBugRate() {
        return defaultBugRate;
    }

    public void setDefaultBugRate(int defaultBugRate) {
        this.defaultBugRate = defaultBugRate;
    }

    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", salary=" + salary + ", fixedBugs=" + fixedBugs + ", bugRate=" + defaultBugRate + "]";
    }

    public int compareByName(Employee e) {
        return getName().compareTo(e.getName());
    }

    public int compareByNameAndSalary(Employee e) {
        return Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary).compare(this, e);
    }

}
