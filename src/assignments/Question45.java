package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student1 {
    private int id;
    private String name;
    private String department;

    public Student1(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Question45 {

	public static void main(String[] args) {
        List<Student1> s = new ArrayList<>();

        s.add(new Student1(1, "Satya", "CSE"));
        s.add(new Student1(2, "Saii", "ECE"));
        s.add(new Student1(3, "Kiran", "CSE"));
        s.add(new Student1(4, "Mani", "IT"));
        s.add(new Student1(5, "Srujan", "ECE"));
        s.add(new Student1(6, "Damini", "CSE"));
        
        Map<String, List<Student1>> groupedByDept = s.stream()
                .collect(Collectors.groupingBy(Student1::getDepartment));
        for (Map.Entry<String, List<Student1>> entry : groupedByDept.entrySet()) {
            System.out.println("Department: " + entry.getKey());
            System.out.println("Students: ");
            for (Student1 s1 : entry.getValue()) {
                System.out.println(" - " + s1.getName());
            }
            System.out.println();
        }
        
	}
}



/*
Department: CSE
Students: 
 - Satya
 - Kiran
 - Damini

Department: ECE
Students: 
 - Saii
 - Srujan

Department: IT
Students: 
 - Mani

*/