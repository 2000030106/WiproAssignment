package SpringAssignments;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import daofiles.PersonDAOImpl;
import springprograms.Person;

public class PersonCrudMain 
{
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonDAOImpl dao = context.getBean("personDAO", PersonDAOImpl.class);
        Scanner sc = new Scanner(System.in);
        int c;
        
        do {
            System.out.println("\n--- Person Management Menu ---");
            System.out.println("1. Insert Person");
            System.out.println("2. Update Person");
            System.out.println("3. Delete Person");
            System.out.println("4. Get Person by ID");
            System.out.println("5. Get All Persons");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            c = sc.nextInt();

            switch (c) {
            case 1:
                System.out.print("Enter ID: ");
                int id1 = sc.nextInt();
                sc.nextLine(); // consume newline

                System.out.print("Enter First Name: ");
                String fname1 = sc.nextLine();

                System.out.print("Enter Last Name: ");
                String lname1 = sc.nextLine();

                System.out.print("Enter Age: ");
                int age1 = sc.nextInt();

                Person newPerson = new Person(id1, fname1, lname1, age1);
                dao.insert(newPerson);
                System.out.println("Person inserted successfully.");
                break;

            case 2:
                System.out.print("Enter ID to Update: ");
                int id2 = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Updated First Name: ");
                String fname2 = sc.nextLine();

                System.out.print("Enter Updated Last Name: ");
                String lname2 = sc.nextLine();

                System.out.print("Enter Updated Age: ");
                int age2 = sc.nextInt();

                Person updatedPerson = new Person(id2, fname2, lname2, age2);
                dao.update(updatedPerson);
                System.out.println("Person updated successfully.");
                break;

            case 3:
                System.out.print("Enter ID to Delete: ");
                int id3 = sc.nextInt();
                dao.delete(id3);
                System.out.println("Person deleted successfully.");
                break;

            case 4:
                System.out.print("Enter ID to Fetch: ");
                int id4 = sc.nextInt();
                Person person = dao.getById(id4);
                System.out.println(person);
                break;

            case 5:
                List<Person> persons = dao.getAll();
                for (Person p : persons) {
                    System.out.println(p);
                }
                break;

            case 0:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice. Try again.");
        }

    } while (c != 0);

}
            
}

/*
 * 
--- Person Management Menu ---
1. Insert Person
2. Update Person
3. Delete Person
4. Get Person by ID
5. Get All Persons
0. Exit
Enter your choice: 1
Enter ID: 52
Enter First Name: Sam
Enter Last Name: Kumar
Enter Age: 24
Person inserted successfully.

--- Person Management Menu ---
1. Insert Person
2. Update Person
3. Delete Person
4. Get Person by ID
5. Get All Persons
0. Exit
Enter your choice: 5
Person [id=0, firstName=null, lastName=null, age=0]
Person [id=1, firstName=satya, lastName=sai, age=22]
Person [id=52, firstName=Sam, lastName=Kumar, age=24]

--- Person Management Menu ---
1. Insert Person
2. Update Person
3. Delete Person
4. Get Person by ID
5. Get All Persons
0. Exit
Enter your choice: 2
Enter ID to Update: 52
Enter Updated First Name: Sampath
Enter Updated Last Name: Kumar
Enter Updated Age: 24
Person updated successfully.

--- Person Management Menu ---
1. Insert Person
2. Update Person
3. Delete Person
4. Get Person by ID
5. Get All Persons
0. Exit
Enter your choice: 5
Person [id=0, firstName=null, lastName=null, age=0]
Person [id=1, firstName=satya, lastName=sai, age=22]
Person [id=52, firstName=Sampath, lastName=Kumar, age=24]

--- Person Management Menu ---
1. Insert Person
2. Update Person
3. Delete Person
4. Get Person by ID
5. Get All Persons
0. Exit
Enter your choice: 4
Enter ID to Fetch: 1
Person [id=1, firstName=satya, lastName=sai, age=22]

--- Person Management Menu ---
1. Insert Person
2. Update Person
3. Delete Person
4. Get Person by ID
5. Get All Persons
0. Exit
Enter your choice: 3
Enter ID to Delete: 52
Person deleted successfully.

--- Person Management Menu ---
1. Insert Person
2. Update Person
3. Delete Person
4. Get Person by ID
5. Get All Persons
0. Exit
Enter your choice: 0
Exiting...

*/
