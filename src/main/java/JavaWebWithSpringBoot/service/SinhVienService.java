package JavaWebWithSpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaWebWithSpringBoot.dao.SinhVienDao;
import JavaWebWithSpringBoot.model.SinhVien;

@Service
public class SinhVienService {
	@Autowired
	SinhVienDao sinhVienDao;
	
	public List<SinhVien> getAll(){
		return sinhVienDao.findAll();
	}
	

	public Optional<SinhVien> findById(String id) {
		return sinhVienDao.findById(id);
	}
	
	public SinhVien addSinhVien(SinhVien sinhVien) {
		return sinhVienDao.save(sinhVien);
	}
	
	public void deleteSinhVienById(String id) {
		sinhVienDao.deleteById(id);
	}
	
	
}
