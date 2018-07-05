package ru.gothmog.one_to_many.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gothmog.one_to_many.model.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findById(long id);

    List<Employee> findByDepartmentId(Long departmentId);
}
