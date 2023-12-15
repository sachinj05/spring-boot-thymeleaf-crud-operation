package my.thymeleaf.project.service;

import java.util.List;

import my.thymeleaf.project.model.Employee;

public interface EmployeeServices {
	
	 List<Employee> getAllEmployee();
	    void save(Employee employee);
	    Employee getById(Long id);
	    void deleteViaId(long id);

}
