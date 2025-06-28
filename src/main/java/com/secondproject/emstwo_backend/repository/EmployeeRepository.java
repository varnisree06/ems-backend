package com.secondproject.emstwo_backend.repository;

import com.secondproject.emstwo_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
