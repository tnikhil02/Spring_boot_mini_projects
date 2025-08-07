package in.nik.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.nik.main.entity.Student;
import in.nik.main.service.StudentService;


@Controller
public class show_list_controller {
	@Autowired
	StudentService serv;
	@GetMapping("/show_Page")
	public String show_page_students(Model model) {
		List<Student>lis=serv.show_list();
		model.addAttribute("students",lis);
		return "All_students";
	}
}
