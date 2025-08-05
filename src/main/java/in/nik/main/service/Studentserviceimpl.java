package in.nik.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nik.main.entity.Student;
import in.nik.main.repository.Student_repository;
@Service
public class Studentserviceimpl implements StudentService 
{
	@Autowired
	Student_repository std_table;
	@Override
	public Boolean addStddet(Student std) {
		try {
			std_table.save(std);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public Boolean updateStdbyid(Student std) {
		Integer id=std.getId();
		Student std_1=std_table.findById(id).orElse(null);
		if(std_1!=null) {
			std_table.save(std);
			return true;
		}
		else {
			return false;	
		}
	}

}
