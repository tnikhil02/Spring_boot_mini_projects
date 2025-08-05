package in.nik.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nik.main.entity.Student;

public interface Student_repository extends JpaRepository<Student, Integer> 
{

}
