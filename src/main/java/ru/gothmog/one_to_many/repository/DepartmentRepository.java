package ru.gothmog.one_to_many.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gothmog.one_to_many.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
