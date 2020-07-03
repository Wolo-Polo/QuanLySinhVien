package JavaWebWithSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import JavaWebWithSpringBoot.model.SinhVien;
import JavaWebWithSpringBoot.service.SinhVienService;

@Controller
public class SinhVienController {
	@Autowired
	SinhVienService sinhVienService;
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String getAddSinhVienPage(Model model) {
	
		model.addAttribute("sinhVien", new SinhVien());
	
		return "addSinhVien";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String addSinhVien(Model model, @ModelAttribute SinhVien sinhVien) {
		try {
			sinhVienService.addSinhVien(sinhVien);
			model.addAttribute("messenger", "Thêm thành công!");
		}catch(Exception exception) {
			exception.printStackTrace();
			model.addAttribute("messenger", "Thêm thất bại!");
		}
		
		return "addSinhVien";
	}
	
	
	@RequestMapping(value = "update/{id}", method = RequestMethod.GET)
	public String getUpdateSinhVienPage(Model model, @PathVariable("id") String id) {
		SinhVien sinhVien= sinhVienService.findById(id).get();
		model.addAttribute("sinhVien", sinhVien);
		
		return "updateSinhVien";
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updateSinhVien(Model model, @ModelAttribute SinhVien sinhVien) {
		try {
			sinhVienService.addSinhVien(sinhVien);
			model.addAttribute("messenger", "Đã cập nhật thành công!");
		}catch(Exception exception) {
			exception.printStackTrace();
			model.addAttribute("messenger", "Cập nhật thất bại!");
		}
		
		return "redirect:home";
	}
	
	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public String deleteSinhVien(Model model, @RequestParam("id") String id) {
		try {
			sinhVienService.deleteSinhVienById(id);
			model.addAttribute("messenger", "Xóa thành công!");
		}catch(Exception exception) {
			exception.printStackTrace();
			model.addAttribute("messenger", "Xóa thất bại!");
		}
		
		return "redirect:home";
	}
}
