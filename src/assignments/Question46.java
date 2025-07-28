package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Repository<T, ID> {
    private Map<ID, T> storage = new HashMap<>();

    public void save(ID id, T entity) {
        storage.put(id, entity);
    }

    public T findById(ID id) {
        return storage.get(id);
    }

    public List<T> findAll() {
        return new ArrayList<>(storage.values());
    }

    public void deleteById(ID id) {
        storage.remove(id);
    }
}


 class Employee12 {
    private int id;
    private String name;
    private double salary;

    public Employee12(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
    	return id; 
    	}
    public String getName() { 
    	return name; 
    	}
    public double getSalary() { 
    	return salary; 
    	}

    @Override
    public String toString() {
        return "Employee12{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}
 
 


public class Question46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Repository<Employee12, Integer>ep = new Repository<>();

       ep.save(1, new Employee12(1, "Satya", 50000));
        ep.save(2, new Employee12(2, "Sai", 60000));
        ep.save(3, new Employee12(3, "Srujan", 55000));

        System.out.println("All Employees:");
        List<Employee12> allEmployees = ep.findAll();
        for (Employee12 e : allEmployees) {
            System.out.println(e);
        }

        System.out.println("\nEmployee12 with ID 2:");
        Employee12 emp = ep.findById(2);
        System.out.println(emp);

        ep.deleteById(1);
        System.out.println("\nAfter deleting Employee12 with ID 1:");
        List<Employee12> remaining = ep.findAll();
        for (Employee12 e : remaining) {
            System.out.println(e);
        }
	}

}


/*
All Employees:
Employee12{id=1, name='Satya', salary=50000.0}
Employee12{id=2, name='Sai', salary=60000.0}
Employee12{id=3, name='Srujan', salary=55000.0}

Employee12 with ID 2:
Employee12{id=2, name='Sai', salary=60000.0}

After deleting Employee12 with ID 1:
Employee12{id=2, name='Sai', salary=60000.0}
Employee12{id=3, name='Srujan', salary=55000.0}
*/