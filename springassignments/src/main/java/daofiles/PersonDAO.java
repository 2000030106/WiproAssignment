package daofiles;

import java.util.List;

import springprograms.Person;

public interface PersonDAO 
{
	List<Person> getAll();
	Person getById(int id);
	void insert(Person person);
	void update(Person person);
	void delete(int id);

}
