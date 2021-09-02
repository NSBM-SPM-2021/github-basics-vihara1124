package edu.nsbm.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.nsbm.sms.entity.Student;
import edu.nsbm.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student student1 = new Student("Thilakshi", "Vihara", "tatvthilakarathne@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("Ama", "Indeewari", "amasuraweera@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("Thilini", "Nimesha", "thilininimesha@gmail.com");
		studentRepository.save(student3);
				
	}

}
