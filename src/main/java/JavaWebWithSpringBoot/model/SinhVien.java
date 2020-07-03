package JavaWebWithSpringBoot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sinhvien")
public class SinhVien {
	@Column(name = "masinhvien")
	@Id
	private String maSinhVien;
	
	@Column(name = "tensinhvien")
	private String tenSinhVien;
	
	@Column(name = "lop")
	private String lop;
	
	@Column(name = "nienkhoa")
	private String nienKhoa;
	
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getTenSinhVien() {
		return tenSinhVien;
	}
	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getNienKhoa() {
		return nienKhoa;
	}
	public void setNienKhoa(String nienKhoa) {
		this.nienKhoa = nienKhoa;
	}
	public SinhVien(String maSinhVien, String tenSinhVien, String lop, String nienKhoa) {
		super();
		this.maSinhVien = maSinhVien;
		this.tenSinhVien = tenSinhVien;
		this.lop = lop;
		this.nienKhoa = nienKhoa;
	}
	public SinhVien() {
		super();
	}
	
}
