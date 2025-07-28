package assignments;

class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

class Employee13 {
    private String name;
    private double salary;
	public Employee13(String name, double salary) {
		super();
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

class EmployeeService {

    public void validateSalary(double salary) throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative: " + salary);
        }
    }

    public void processSalary(Employee13 emp) throws InvalidSalaryException {
        validateSalary(emp.getSalary());
        System.out.println("Processing salary for employee: " + emp.getName());
    }

    public void startProcess(Employee13 emp) throws InvalidSalaryException {
        processSalary(emp);
    }
}



public class Question47 {

	public static void main(String[] args) {
		Employee13 emp = new Employee13("Satya", 5000);

        EmployeeService service = new EmployeeService();

        try {
            service.startProcess(emp);
        } catch (InvalidSalaryException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
		// TODO Auto-generated method stub

	
}

/*
Exception caught: Salary cannot be negative: -5000.0

 */

/*
*Processing salary for employee: Satya
*/

