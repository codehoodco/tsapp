package com.tsapp;

import com.tsapp.domain.Employee;
import com.tsapp.utils.DataLoader;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import java.util.Arrays;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public DataLoader nolimit(ApplicationContext applicationContext) {
        return new DataLoader() {
            @Override
            public int getOrder() {
                return 0;
            }

            @Override
            public void run(String[] s) {
                System.out.println("the second one");
                ;
            }
        };
    }

    @Bean
    Beany firstBeany() {
        return new Beany(5);
    }

    @Bean
    Beany secondBeany() {
        return new Beany(6);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
