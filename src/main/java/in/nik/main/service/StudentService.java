package in.nik.main.service;


import java.util.List;

import in.nik.main.entity.Student;

public interface StudentService 
{
	public Boolean addStddet(Student std); 
	public Boolean updateStdbyid(Student std);
	public List<Student> show_list();
}
