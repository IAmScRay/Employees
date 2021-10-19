package me.iamscray;

import java.util.Random;

public class EmployeeFactory {

    public static final String[] males = {
        "Paul",
        "Peter",
        "Pedro",
        "Michael"
    };

    public static final String[] females = {
        "Anna",
        "Michelle",
        "Kara",
        "Lisa"
    };

    public static Employee[] generateEmployees(int size) {
        Employee[] result = new Employee[size];

        for(int i = 0; i < size; i++) {
            Random rand = new Random();

            Employee e = new Employee();
            e.setID(Math.abs(rand.nextLong()));

            if(rand.nextBoolean()) {
                e.setName(males[rand.nextInt(males.length - 1)]);
                e.setGender("Male");
            } else {
                e.setName(females[rand.nextInt(females.length - 1)]);
                e.setGender("Female");
            }

            e.setAge(rand.nextInt(60));
            e.setSalary(rand.nextDouble() * 10000D);
            e.setDefaultBugRate(rand.nextInt(250));
            e.setFixedBugs(rand.nextInt(10));

            result[i] = e;
        }

        return result;
    }

}
