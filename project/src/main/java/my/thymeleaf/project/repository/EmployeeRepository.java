package my.thymeleaf.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import my.thymeleaf.project.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
 
}