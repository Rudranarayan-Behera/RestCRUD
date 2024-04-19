package tech.csm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.csm.entity.MyEmp;

@Repository
public interface EmployeeRepo extends JpaRepository<MyEmp, Integer> {

	

}
