package edu.nsbm.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.nsbm.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
