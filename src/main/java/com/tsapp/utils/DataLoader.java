package com.tsapp.utils;

import com.tsapp.domain.Employee;
import com.tsapp.domain.Project;
import com.tsapp.repository.EmployeeRepository;
import com.tsapp.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public void run(String[] s) {
        employeeRepository.deleteAll();
        projectRepository.deleteAll();
        employeeRepository.save(new Employee("Abhishek", "Tejpaul", "abhishek.tejpaul@gmail.com"));
        projectRepository.save(new Project("PMAN", "Vroozi", "Hugo Solano", "abhishek.tejpaul+hugo@gmail.com"));
        System.out.println(employeeRepository.findByEmail("abhishek.tejpaul@gmail.com"));
        System.out.println(projectRepository.findByCompanyName("Vroozi"));
    }
}
