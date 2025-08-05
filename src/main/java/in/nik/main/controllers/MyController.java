package in.nik.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.nik.main.entity.Student;
import in.nik.main.service.StudentService;

@Controller
public class MyController {
	@Autowired
	StudentService serv;
	@GetMapping("/add_std_form")
	public String openaddstdPage(Model model) {
		model.addAttribute("student",new Student());
		return "addStudent.html";
	}
	@PostMapping("/addingstd_page")
	public String addstdPage(@ModelAttribute("student") Student std,Model model) {
		if(serv.addStddet(std)) {
			model.addAttribute("successMsg","Successfully added");
		}
		else {
			model.addAttribute("error","details were not added due to some error");
		}
		return "addStudent.html";
		
	}
}
