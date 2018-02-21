package com.tsapp.utils;

import com.tsapp.Beany;
import com.tsapp.domain.Employee;
import com.tsapp.domain.Project;
import com.tsapp.repository.EmployeeRepository;
import com.tsapp.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner, Ordered {

    @Autowired
    EmployeeRepository er;

    @Autowired
    ProjectRepository pr;

    @Autowired
    @Qualifier("firstBeany")
    Beany firstBany;

    @Autowired
    @Qualifier("secondBeany")
    Beany secondBany;

    @Override
    public void run(String[] s) {
        System.out.println("the first one");
//        er.deleteAll();
//        pr.deleteAll();
//        er.save(new Employee("Abhishek", "Tejpaul", "abhishek.tejpaul@gmail.com"));
//        pr.save(new Project("PMAN", "Vroozi", "Hugo Solano", "abhishek.tejpaul+hugo@gmail.com"));
//        System.out.println(er.findByEmail("abhishek.tejpaul@gmail.com"));
//        System.out.println(pr.findByCompanyName("Vroozi"));
//        System.out.println(pr.findByCompanyNameStartingWithCharacterSequenceIgnoreCase("Vro"));
//        System.out.println(pr.findByCompanyNameStartingWithCharacterSequenceIgnoreCase("ro"));
//        firstBany.num();
//        secondBany.num();
    }

    @Override
    public int getOrder() {
        return 1;
    }

//    @Bean
//    EmployeeRepository createEmployeeRepo(){
//        return new EmployeeRepository() {
//            @Override
//            public Employee findByFirstName(String firstName) {
//                return null;
//            }
//
//            @Override
//            public List<Employee> findByLastName(String lastName) {
//                return null;
//            }
//
//            @Override
//            public Employee findByEmail(String email) {
//                return null;
//            }
//
//            @Override
//            public <S extends T> List<S> save(Iterable<S> entites) {
//                return null;
//            }
//
//            @Override
//            public List<Employee> findAll() {
//                return null;
//            }
//
//            @Override
//            public List<Employee> findAll(Sort sort) {
//                return null;
//            }
//
//            @Override
//            public <S extends T> S insert(S entity) {
//                return null;
//            }
//
//            @Override
//            public <S extends T> List<S> insert(Iterable<S> entities) {
//                return null;
//            }
//
//            @Override
//            public <S extends T> List<S> findAll(Example<S> example) {
//                return null;
//            }
//
//            @Override
//            public <S extends T> List<S> findAll(Example<S> example, Sort sort) {
//                return null;
//            }
//
//            @Override
//            public Page<Employee> findAll(Pageable pageable) {
//                return null;
//            }
//
//            @Override
//            public <S extends T> S save(S entity) {
//                return null;
//            }
//
//            @Override
//            public Employee findOne(String s) {
//                return null;
//            }
//
//            @Override
//            public boolean exists(String s) {
//                return false;
//            }
//
//            @Override
//            public Iterable<Employee> findAll(Iterable<String> strings) {
//                return null;
//            }
//
//            @Override
//            public long count() {
//                return 0;
//            }
//
//            @Override
//            public void delete(String s) {
//
//            }
//
//            @Override
//            public void delete(Employee entity) {
//
//            }
//
//            @Override
//            public void delete(Iterable<? extends Employee> entities) {
//
//            }
//
//            @Override
//            public void deleteAll() {
//
//            }
//
//            @Override
//            public <S extends T> S findOne(Example<S> example) {
//                return null;
//            }
//
//            @Override
//            public <S extends T> Page<S> findAll(Example<S> example, Pageable pageable) {
//                return null;
//            }
//
//            @Override
//            public <S extends T> long count(Example<S> example) {
//                return 0;
//            }
//
//            @Override
//            public <S extends T> boolean exists(Example<S> example) {
//                return false;
//            }
//        }
//    }
}
