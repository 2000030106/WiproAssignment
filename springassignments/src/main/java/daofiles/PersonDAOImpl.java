package daofiles;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import springprograms.Person;

public class PersonDAOImpl implements PersonDAO {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static class PersonRowMapper implements RowMapper<Person> {
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person person = new Person();
            person.setId(rs.getInt("id"));
            person.setFirstName(rs.getString("firstName"));
            person.setLastName(rs.getString("lastName"));
            person.setAge(rs.getInt("age"));
            return person;
        }
    }

    public List<Person> getAll() {
        String sql = "SELECT * FROM person";
        return jdbcTemplate.query(sql, new PersonRowMapper());
    }

    public Person getById(int id) {
        String sql = "SELECT * FROM person WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new PersonRowMapper());
    }

    public void insert(Person person) {
        String sql = "INSERT INTO person (id, firstName, lastName, age) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, person.getId(), person.getFirstName(), person.getLastName(), person.getAge());
    }

    public void update(Person person) {
        String sql = "UPDATE person SET firstName = ?, lastName = ?, age = ? WHERE id = ?";
        jdbcTemplate.update(sql, person.getFirstName(), person.getLastName(), person.getAge(), person.getId());
    }

    public void delete(int id) {
        String sql = "DELETE FROM person WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
