package tech.csm.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="myemp")
@Data
public class MyEmp {
	@Id
	private Integer employee_id ;
	private String name; 
	private Double salary; 
	private Date hire_date; 
	private Integer department_id;

}
