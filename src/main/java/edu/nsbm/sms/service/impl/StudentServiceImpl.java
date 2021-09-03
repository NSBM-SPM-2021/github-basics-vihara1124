package edu.nsbm.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.nsbm.sms.entity.Student;
import edu.nsbm.sms.repository.StudentRepository;
import edu.nsbm.sms.service.StudentService;

@Service

public class StudentServiceImpl implements StudentService{

	
	private StudentRepository studentRepository;
		
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}



	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

}
