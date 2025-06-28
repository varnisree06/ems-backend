package com.secondproject.emstwo_backend.mapper;

import com.secondproject.emstwo_backend.dto.EmployeeDto;
import com.secondproject.emstwo_backend.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEntity(EmployeeDto dto) {
        return new Employee(
                dto.getId(),
                dto.getFirstName(),
                dto.getLastName(),
                dto.getEmail()
        );
    }
}
