package assignments;

class Employee23{
	private String name;
    private double salary;

    public Employee23(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
	
}

@FunctionalInterface
 interface EmployeeProcessor {
    void process(Employee23 e);
}


public class Question48 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		 Employee23 emp1 = new Employee23("Satya", 50000);
	        Employee23 emp2 = new Employee23("Sai", 60000);

	        EmployeeProcessor printDetails = (Employee23 e) -> {
	            System.out.println("Name: " + e.getName() + ", Salary: " + e.getSalary());
	        };
	        
	        EmployeeProcessor calculateBonus = (Employee23 e) -> {
	            double bonus = e.getSalary() * 0.10;
	            System.out.println("Bonus for " + e.getName() + ": " + bonus);
	        };

	        System.out.println("Employee Details:");
	        printDetails.process(emp1);
	        printDetails.process(emp2);

	        System.out.println("\nBonus Calculation:");
	        calculateBonus.process(emp1);
	        calculateBonus.process(emp2);
	}

}

/*
 * Employee Details:
Name: Satya, Salary: 50000.0
Name: Sai, Salary: 60000.0

Bonus Calculation:
Bonus for Satya: 5000.0
Bonus for Sai: 6000.0
*/
