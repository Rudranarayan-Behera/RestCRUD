package tech.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.csm.entity.MyEmp;
import tech.csm.repo.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo emprepo;

	@Override
	public List<MyEmp> getAllemp() {
		
		return emprepo.findAll();
	}

}
