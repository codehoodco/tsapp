package com.tsapp.repository;

import com.tsapp.domain.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

@Component
public interface HellYa extends Repository<Employee, String> {

}
