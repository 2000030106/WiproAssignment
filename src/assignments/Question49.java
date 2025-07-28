package assignments;

import java.util.Optional;

class Employee123 {
    private String name;
    private double salary;
    private Optional<String> email;
    private Optional<String> department;

    public Employee123(String name, double salary, Optional<String> email, Optional<String> department) {
        this.name = name;
        this.salary = salary;
        this.email = email;
        this.department = department;
    }

    
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public Optional<String> getDepartment() {
        return department;
    }
}

class MissingFieldException extends RuntimeException {
    public MissingFieldException(String message) {
        super(message);
    }
}


public class Question49 {

	public static void main(String[] args) {
		Employee123 emp1 = new Employee123(
                "Satya",
                50000,
                Optional.of("satya@gmail.com"),
                Optional.of("Engineering")
        );

        Employee123 emp2 = new Employee123(
                "srujan",
                60000,
                Optional.empty(),
                Optional.empty()
        );

        System.out.println("Employee 1:");
        displayEmployee(emp1);
        
        System.out.println("\nEmployee 2:");
        displayEmployee(emp2);
    }

    public static void displayEmployee(Employee123 emp) {
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());

        String email = emp.getEmail().orElse("Email not provided");
        System.out.println("Email: " + email);

        String department = emp.getDepartment()
                .orElseThrow(() -> new MissingFieldException("Department is required!"));
        System.out.println("Department: " + department);

	}

}

/*
 * Employee 1:
Name: Satya
Salary: 50000.0
Email: satya@gmail.com
Department: Engineering

Employee 2:
Name: srujan
Salary: 60000.0
Email: Email not provided
Exception in thread "main" assignments.MissingFieldException: Department is required!
	at assignments.Question49.lambda$0(Question49.java:81)
	at java.base/java.util.Optional.orElseThrow(Optional.java:408)
	at assignments.Question49.displayEmployee(Question49.java:81)
	at assignments.Question49.main(Question49.java:68)
*/
