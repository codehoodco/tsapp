package com.tsapp.repository;


import java.util.List;

import com.tsapp.domain.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

    public Employee findByFirstName(String firstName);

    public List<Employee> findByLastName(String lastName);

    public Employee findByEmail(String email);

}