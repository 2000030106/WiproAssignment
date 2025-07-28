package assignments;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Employee20
{
	int id;
	String name;
	String dept;
	double salary;
	
	
	
	public Employee20(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee20 [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
	
}
public class Question50 {

	public static void main(String[] args) {

		List<Employee20> employees = Arrays.asList(
			    new Employee20(101, "Ravi", "HR", 50000),
			    new Employee20(102, "Priya", "IT", 60000),
			    new Employee20(103, "Arun", "HR", 55000),
			    new Employee20(104, "Kavya", "IT", 70000),
			    new Employee20(105, "Divya", "Sales", 45000)
			);
		//names from above one using stream
		System.out.println("1");
		employees.stream()
        .map(Employee20::getName)
        .forEach(System.out::println);	
		
		//Filter and print employees with salary > 55000
		System.out.println("2");
		List<Float> emp = employees.stream()
			    .filter(p -> p.getSalary() > 55000)
			    .map(p -> (float)p.getSalary()) 
			    .collect(Collectors.toList());

			emp.forEach(System.out::println);
			
		//Q3. Count the number of employees in "HR" department
			System.out.println("3");
			long count = employees.stream().filter(pro -> pro.getDept() == "HR").count(); // terminal
			System.out.println("Hr Dept:" + count);
			
			//Q4. Sort employees by salary in descending order
			System.out.println("4");
			List<Employee20> sortedList = employees.stream()
		            .sorted(Comparator.comparingDouble(Employee20::getSalary).reversed())
		            .collect(Collectors.toList());

		        sortedList.forEach(System.out::println);
		        
		    //Q5. Find the highest paid employee (use max)
		        System.out.println("5");
		        Optional<Employee20> maxItem = employees.stream()
		        	    .max(Comparator.comparingDouble(Employee20::getSalary));

		        	maxItem.ifPresent(e -> System.out.println("Highest Salary: " + e.getSalary()));

		    //Q6. Find the average salary of all employees

		      System.out.println("6");
		      OptionalDouble avgsalary = employees.stream()
		    		    .mapToDouble(Employee20::getSalary)
		    		    .average();

		    		System.out.println("Average Salary : " + avgsalary.getAsDouble());
				
		    		
		    		
		    //Q7. Collect all names into a List
		    		System.out.println("7");
		    		List<String> names = employees.stream()
		    			    .map(Employee20::getName)
		    			    .collect(Collectors.toList());

		    			System.out.println("All Employee Names: " + names);
		    
		     //Q8. Group employees by department (use Collectors.groupingBy)
		    			System.out.println("8");
		    			Map<String, List<Employee20>> employeesByDept = employees.stream()
		    				    .collect(Collectors.groupingBy(Employee20::getDept));

		    				employeesByDept.forEach((dept, empList) -> {
		    				    System.out.println("Department: " + dept);
		    				    empList.forEach(e -> System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary()));
		    				});

		    				
		    //Q9. Calculate total salary per department
		    				System.out.println("9");
		    				Map<String, Double> totalSalaryByDept = employees.stream()
		    					    .collect(Collectors.groupingBy(
		    					        Employee20::getDept,
		    					        Collectors.summingDouble(Employee20::getSalary)
		    					    ));

		    					totalSalaryByDept.forEach((dept, totalSalary) -> 
		    					    System.out.println("Department: " + dept + ", Total Salary: " + totalSalary));

		    					// Q10. Find names of employees in IT department sorted by salary
		    					List<String> itNamesSorted = employees.stream()
		    					    .filter(e -> "IT".equals(e.getDept()))
		    					    .sorted(Comparator.comparingDouble(Employee20::getSalary))
		    					    .map(Employee20::getName)
		    					    .collect(Collectors.toList());
		    					System.out.println("Q10 - IT Department Employees Sorted by Salary: " + itNamesSorted);

		    					// Q11. Check if any employee earns less than 40000
		    					boolean hasLowEarner = employees.stream()
		    					    .anyMatch(e -> e.getSalary() < 40000);
		    					System.out.println("Q11 - Any employee earns less than 40000? " + hasLowEarner);

		    					// Q12. Get a comma-separated string of all employee names
		    					String namesCSV = employees.stream()
		    					    .map(Employee20::getName)
		    					    .collect(Collectors.joining(", "));
		    					System.out.println("Q12 - Comma-separated employee names: " + namesCSV);

		    					// Q13. Get a list of top 2 highest earning employees
		    					List<Employee20> top2Earners = employees.stream()
		    					    .sorted(Comparator.comparingDouble(Employee20::getSalary).reversed())
		    					    .limit(2)
		    					    .collect(Collectors.toList());
		    					System.out.println("Q13 - Top 2 highest earning employees: " + top2Earners);

		    					// Q14. Skip first 2 employees and print the rest
		    					List<Employee20> skippedFirstTwo = employees.stream()
		    					    .skip(2)
		    					    .collect(Collectors.toList());
		    					System.out.println("Q14 - Employees after skipping first two: " + skippedFirstTwo);

		    					// Q15. Limit to first 3 employees and print their names
		    					List<String> first3Names = employees.stream()
		    					    .limit(3)
		    					    .map(Employee20::getName)
		    					    .collect(Collectors.toList());
		    					System.out.println("Q15 - First 3 employee names: " + first3Names);

		    					// Q16. Get employee with minimum salary in HR department
		    					Employee20 minHREmployee = employees.stream()
		    					    .filter(e -> "HR".equals(e.getDept()))
		    					    .min(Comparator.comparingDouble(Employee20::getSalary))
		    					    .orElse(null);
		    					System.out.println("Q16 - Employee with minimum salary in HR: " + minHREmployee);

		    					// Q17. Partition employees into two groups: salary > 55000 and <= 55000
		    					Map<Boolean, List<Employee20>> salaryPartition = employees.stream()
		    					    .collect(Collectors.partitioningBy(e -> e.getSalary() > 55000));
		    					System.out.println("Q17 - Salary > 55000: " + salaryPartition.get(true));
		    					System.out.println("Q17 - Salary <= 55000: " + salaryPartition.get(false));

		    					// Q18. Create a Map<Department, AverageSalary>
		    					Map<String, Double> avgSalaryByDept = employees.stream()
		    					    .collect(Collectors.groupingBy(
		    					        Employee20::getDept,
		    					        Collectors.averagingDouble(Employee20::getSalary)
		    					    ));
		    					System.out.println("Q18 - Average Salary by Department: " + avgSalaryByDept);

		    					// Q19. Sort employees by name and then by salary
		    					List<Employee20> sortedByNameThenSalary = employees.stream()
		    					    .sorted(Comparator.comparing(Employee20::getName)
		    					        .thenComparing(Employee20::getSalary))
		    					    .collect(Collectors.toList());
		    					System.out.println("Q19 - Employees sorted by Name, then Salary: " + sortedByNameThenSalary);

		    					// Q20. Convert List<Employee> into Map<Id, Name>
		    					Map<Integer, String> idNameMap = employees.stream()
		    					    .collect(Collectors.toMap(Employee20::getId, Employee20::getName));
		    					System.out.println("Q20 - Map<Id, Name>: " + idNameMap);

		    					// Challenge 1: Get employees whose name starts with “D” and ends with “a”
		    					List<Employee20> filteredByName = employees.stream()
		    					    .filter(e -> e.getName().startsWith("D") && e.getName().endsWith("a"))
		    					    .collect(Collectors.toList());
		    					System.out.println("Challenge 1 - Names start with D and end with a: " + filteredByName);

		    					// Challenge 2: List departments with more than 1 employee
		    					List<String> departmentsWithMultiple = employees.stream()
		    					    .collect(Collectors.groupingBy(Employee20::getDept, Collectors.counting()))
		    					    .entrySet().stream()
		    					    .filter(e -> e.getValue() > 1)
		    					    .map(Map.Entry::getKey)
		    					    .collect(Collectors.toList());
		    					System.out.println("Challenge 2 - Departments with > 1 employee: " + departmentsWithMultiple);

		    					// Challenge 3: Find the second highest salary using streams
		    					OptionalDouble secondHighestSalary = employees.stream()
		    					    .mapToDouble(Employee20::getSalary)
		    					    .distinct()
		    					    .sorted()
		    					    .skip(1)
		    					    .findFirst();
		    					System.out.println("Challenge 3 - Second highest salary: " + 
		    					    (secondHighestSalary.isPresent() ? secondHighestSalary.getAsDouble() : "Not Found"));

		    				
	}

}


/*
 * 1
Ravi
Priya
Arun
Kavya
Divya
2
60000.0
70000.0
3
Hr Dept:2
4
Employee20 [id=104, name=Kavya, dept=IT, salary=70000.0]
Employee20 [id=102, name=Priya, dept=IT, salary=60000.0]
Employee20 [id=103, name=Arun, dept=HR, salary=55000.0]
Employee20 [id=101, name=Ravi, dept=HR, salary=50000.0]
Employee20 [id=105, name=Divya, dept=Sales, salary=45000.0]
5
Highest Salary: 70000.0
6
Average Salary : 56000.0
7
All Employee Names: [Ravi, Priya, Arun, Kavya, Divya]
8
Department: Sales
105 Divya 45000.0
Department: HR
101 Ravi 50000.0
103 Arun 55000.0
Department: IT
102 Priya 60000.0
104 Kavya 70000.0
9
Department: Sales, Total Salary: 45000.0
Department: HR, Total Salary: 105000.0
Department: IT, Total Salary: 130000.0
Q10 - IT Department Employees Sorted by Salary: [Priya, Kavya]
Q11 - Any employee earns less than 40000? false
Q12 - Comma-separated employee names: Ravi, Priya, Arun, Kavya, Divya
Q13 - Top 2 highest earning employees: [Employee20 [id=104, name=Kavya, dept=IT, salary=70000.0], Employee20 [id=102, name=Priya, dept=IT, salary=60000.0]]
Q14 - Employees after skipping first two: [Employee20 [id=103, name=Arun, dept=HR, salary=55000.0], Employee20 [id=104, name=Kavya, dept=IT, salary=70000.0], Employee20 [id=105, name=Divya, dept=Sales, salary=45000.0]]
Q15 - First 3 employee names: [Ravi, Priya, Arun]
Q16 - Employee with minimum salary in HR: Employee20 [id=101, name=Ravi, dept=HR, salary=50000.0]
Q17 - Salary > 55000: [Employee20 [id=102, name=Priya, dept=IT, salary=60000.0], Employee20 [id=104, name=Kavya, dept=IT, salary=70000.0]]
Q17 - Salary <= 55000: [Employee20 [id=101, name=Ravi, dept=HR, salary=50000.0], Employee20 [id=103, name=Arun, dept=HR, salary=55000.0], Employee20 [id=105, name=Divya, dept=Sales, salary=45000.0]]
Q18 - Average Salary by Department: {Sales=45000.0, HR=52500.0, IT=65000.0}
Q19 - Employees sorted by Name, then Salary: [Employee20 [id=103, name=Arun, dept=HR, salary=55000.0], Employee20 [id=105, name=Divya, dept=Sales, salary=45000.0], Employee20 [id=104, name=Kavya, dept=IT, salary=70000.0], Employee20 [id=102, name=Priya, dept=IT, salary=60000.0], Employee20 [id=101, name=Ravi, dept=HR, salary=50000.0]]
Q20 - Map<Id, Name>: {101=Ravi, 102=Priya, 103=Arun, 104=Kavya, 105=Divya}
Challenge 1 - Names start with D and end with a: [Employee20 [id=105, name=Divya, dept=Sales, salary=45000.0]]
Challenge 2 - Departments with > 1 employee: [HR, IT]
Challenge 3 - Second highest salary: 50000.0
*/
