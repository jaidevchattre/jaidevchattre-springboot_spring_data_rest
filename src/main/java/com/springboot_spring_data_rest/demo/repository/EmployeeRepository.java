package com.springboot_spring_data_rest.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springboot_spring_data_rest.demo.entity.Employee;
@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//just provide entity type and primary key
//we get all crud methods
}
