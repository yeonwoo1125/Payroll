package spring.guide.payroll.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.guide.payroll.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
