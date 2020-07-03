package JavaWebWithSpringBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import JavaWebWithSpringBoot.model.SinhVien;

@Repository
public interface SinhVienDao extends JpaRepository<SinhVien, String> {

}
