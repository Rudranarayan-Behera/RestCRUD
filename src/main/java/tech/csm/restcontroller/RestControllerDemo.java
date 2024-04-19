package tech.csm.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.csm.domain.Book;
import tech.csm.entity.MyEmp;
import tech.csm.service.EmployeeService;

@RestController
public class RestControllerDemo {
	
	@Autowired
	private EmployeeService empService;
	
	
	@GetMapping("/emp")
	public List<MyEmp> getAllemp(){
		return empService.getAllemp();
	}

}
