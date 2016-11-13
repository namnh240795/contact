package restful.contact.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import restful.contact.entity.Contact;
@Repository
public class ContactRepositoryC {
	private JdbcTemplate jdbcTemplate;

	public ContactRepositoryC(DataSource dataSource) {
		super();
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public List<Contact> findAll() {
        String sql = "SELECT * FROM contact";
        List<Contact> contacts = jdbcTemplate.query(sql, new RowMapper<Contact>() {

            @Override
            public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
                Contact contact = new Contact();

                contact.setStudent_id(rs.getString("student_id"));
                contact.setName(rs.getString("name"));
                contact.setEmail(rs.getString("email"));
                contact.setClas(rs.getString("class"));
                contact.setPhone(rs.getString("telephone"));

                return contact;
            }

        });

        return contacts;
    }
}
