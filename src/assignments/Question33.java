package assignments;

class LowSalException extends Exception {

    public LowSalException(String message) {
        super(message);
    }
    
    
} 
class Emp{
	
	private int empId;
    private String empName;
    private String designation;
    private double basic;
    private double hra;
    
    public Emp(int empId, String empName, String designation, double basic) throws LowSalException {
        if (basic < 50000) {
            throw new LowSalException("Basic salary (" + basic + ") cannot be less than 50000 for employee " + empName + " (ID: " + empId + ").");
        }

        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.basic = basic;
        calculateHRA();
    }
 
        public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}


		private void calculateHRA() {

        	String lowerCaseDesignation = this.designation.toLowerCase();

            switch (lowerCaseDesignation) {
                case "manager":
                    this.hra = this.basic * 0.10; 
                    break;
                case "teamleader":
                    this.hra = this.basic * 0.12; 
                    break;
                case "hr":
                    this.hra = this.basic * 0.05; 
                    break;
                default:
                    System.out.println("Warning: Unknown designation '" + this.designation + "'. HRA set to 0.");
                    this.hra = 0.0;
                    break;
            }
        }
        public void printDET() {
            System.out.println("------------------------------------");
            System.out.println("Employee ID:      " + this.empId);
            System.out.println("Employee Name:    " + this.empName);
            System.out.println("Designation:      " + this.designation);
            System.out.printf("Basic Salary:     %.2f%n", this.basic);
            System.out.printf("HRA:              %.2f%n", this.hra);
            System.out.println("------------------------------------");
        }
        
        
    }

    
public class Question33 
{
	public static void main(String[] args)
	{

        try {
            System.out.println("\nCreating Employee 1 (Manager with valid salary)...");
            Emp emp1 = new Emp(101, "Satya Sai", "Manager", 75000.00);
            emp1.printDET();
        } catch (LowSalException e) {
            System.err.println("Error creating employee: " + e.getMessage());
        }

        try {
            System.out.println("\nCreating Employee 2 (TeamLeader with valid salary)...");
            Emp emp2 = new Emp(102, "Kiran", "TeamLeader", 60000.00);
            emp2.printDET();
        } catch (LowSalException e) {
            System.err.println("Error creating employee: " + e.getMessage());
        }

        try {
            System.out.println("\nCreating Employee 3 (HR with low salary)...");
            Emp emp3 = new Emp(103, "Srujan", "HR", 45000.00); // This will throw LowSalException
            emp3.printDET(); // This line will not be reached
        } catch (LowSalException e) {
            System.err.println("Error creating employee: " + e.getMessage());
        }

        try {
            System.out.println("\nCreating Employee 4 (Unknown Designation with valid salary)...");
            Emp emp4 = new Emp(104, "Captain America", "Developer", 80000.00);
            emp4.printDET();
        } catch (LowSalException e) {
            System.err.println("Error creating employee: " + e.getMessage());
        }

    }
		
	}

/*
 * output:
 * 
Creating Employee 1 (Manager with valid salary)...
------------------------------------
Employee ID:      101
Employee Name:    Satya Sai
Designation:      Manager
Basic Salary:     75000.00
HRA:              7500.00
------------------------------------

Creating Employee 2 (TeamLeader with valid salary)...
------------------------------------
Employee ID:      102
Employee Name:    Kiran
Designation:      TeamLeader
Basic Salary:     60000.00
HRA:              7200.00
------------------------------------

Creating Employee 3 (HR with low salary)...
Error creating employee: Basic salary (45000.0) cannot be less than 50000 for employee Srujan (ID: 103).

Creating Employee 4 (Unknown Designation with valid salary)...
Warning: Unknown designation 'Developer'. HRA set to 0.
------------------------------------
Employee ID:      104
Employee Name:    Captain America
Designation:      Developer
Basic Salary:     80000.00
HRA:              0.00
------------------------------------
	
 */


