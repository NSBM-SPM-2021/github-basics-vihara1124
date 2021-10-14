package edu.nsbm.sms;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import edu.nsbm.sms.entity.Student;
import edu.nsbm.sms.repository.StudentRepository;

@DataJpaTest
public class StudentTests {
	
	@Autowired
	private StudentRepository repo;
	
	@Test
	public void testCreateStudent() {
		Student student = new Student("thilini98@gmail.com","Thilini","Nimesha");
		repo.save(student);
	}

}
