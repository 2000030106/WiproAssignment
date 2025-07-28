package assignments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee22 {
    private int id;
    private String name;
    private double salary;

    public Employee22(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}

public class Question44 {
    public static void main(String[] args) {
        List<Employee22> employeeList = new ArrayList<>();

        // Adding Employees
        employeeList.add(new Employee22(1, "Satya", 55000));
        employeeList.add(new Employee22(2, "Sai", 72000));
        employeeList.add(new Employee22(3, "Srujan", 65000));
        employeeList.add(new Employee22(4, "Kiran", 72000));

        employeeList.sort(new Comparator<Employee22>() {
            @Override
            public int compare(Employee22 o1, Employee22 o2) {
                return Double.compare(o2.getSalary(), o1.getSalary());
            }
        });

        System.out.println("Employees sorted by salary (descending):");
        for (Employee22 e : employeeList) {
            System.out.println(e);
        }

        employeeList.sort((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()));

        System.out.println("\nEmployees sorted by name (alphabetically):");
        for (Employee22 e : employeeList) {
            System.out.println(e);
        }
    }
}

/*
 * Employees sorted by salary (descending):
Employee [ID=2, Name=Sai, Salary=72000.0]
Employee [ID=4, Name=Kiran, Salary=72000.0]
Employee [ID=3, Name=Srujan, Salary=65000.0]
Employee [ID=1, Name=Satya, Salary=55000.0]

Employees sorted by name (alphabetically):
Employee [ID=4, Name=Kiran, Salary=72000.0]
Employee [ID=2, Name=Sai, Salary=72000.0]
Employee [ID=1, Name=Satya, Salary=55000.0]
Employee [ID=3, Name=Srujan, Salary=65000.0]
*/
