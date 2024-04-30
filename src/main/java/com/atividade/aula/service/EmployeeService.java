package com.atividade.aula.service;

import com.atividade.aula.entity.Employee;
import com.atividade.aula.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> findAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee findById(Long id) {
        Employee entity = employeeRepository.findById(id).orElse(null);

        if (entity != null) return entity;
        else return null;
    }
}
