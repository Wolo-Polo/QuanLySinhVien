package JavaWebWithSpringBoot.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import JavaWebWithSpringBoot.model.SinhVien;
import JavaWebWithSpringBoot.service.SinhVienService;

@RestController
public class SinhVienApi {
	@Autowired
	SinhVienService sinhVienService;
	
	@RequestMapping(value = "api/students", method = RequestMethod.GET,
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public List<SinhVien> getAllStudent() {
		return sinhVienService.getAll();
	}
	
	@RequestMapping(value = "api/student/{id}", method = RequestMethod.GET,
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public SinhVien getStudentById(@PathVariable("id") String id) {
		return sinhVienService.findById(id).get();
	}

	@RequestMapping(value = "api/student", method = RequestMethod.POST)
	public SinhVien addSinhVien(@RequestBody SinhVien sinhVien) {
		return sinhVienService.addSinhVien(sinhVien);
	}
	
	
	@RequestMapping(value = "api/student", method = RequestMethod.PUT)
	public SinhVien getUpdateSinhVienPage(@RequestBody SinhVien sinhVien) {
		return sinhVienService.addSinhVien(sinhVien);
	
	}
	
	
	@RequestMapping(value = "api/student/{id}", method = RequestMethod.DELETE)
	public void deleteSinhVien(@PathVariable("id") String id) {
		sinhVienService.deleteSinhVienById(id);
	}
}
