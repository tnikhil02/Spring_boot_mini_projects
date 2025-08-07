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
public class listController {
	@Autowired
	StudentService serv;
	@GetMapping("/update_std")
	public String updatepage(Model model)
	{
		model.addAttribute("student",new Student());
		return "update";
	}
	@PostMapping("/update_page")
	public String addstdPage(@ModelAttribute("student") Student std,Model model) {
		if(serv.updateStdbyid(std)) {
			model.addAttribute("successMsg","Successfully updated");
		}
		else {
			model.addAttribute("error","details were not updated due to mismatching id");
		}
		return "update";
		
	}

}
