package JavaWebWithSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import JavaWebWithSpringBoot.service.SinhVienService;

@Controller
public class HomeController {
	@Autowired
	SinhVienService sinhVienService;
	
	@RequestMapping({"home", "/"})
	public String getHome(Model model) {
		model.addAttribute("sinhVienList", sinhVienService.getAll());
		return "home";
	}
}
