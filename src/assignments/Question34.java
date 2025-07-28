package assignments;


 class Employee {
    private String empId;         
    private String name;          
    private int yearOfBirth;      

    public Employee(String empId, String name, int yearOfBirth) {
        this.empId = empId;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empId + ", Name: " + name + ", Year of Birth: " + yearOfBirth;
    }

   
}

public class Question34 {
	 public static void main(String[] args) {
	        Employee emp1 = new Employee("31-F-319", "Satya", 2002);
	        Employee emp2 = new Employee("12-S-312", "Sai", 2006);

	        System.out.println(emp1);
	        System.out.println(emp2);
	    }

}

/*
 * 
 * Employee ID: 31-S-319, Name: Satya, Year of Birth: 2002
Employee ID: 12-I-312, Name: Sai, Year of Birth: 2006
*/
