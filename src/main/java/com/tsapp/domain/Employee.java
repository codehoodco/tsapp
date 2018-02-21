package com.tsapp.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.util.StringUtils;


public class Employee {

    @Getter
    @Setter
    @Id
    private String id;

    @Getter
    @Setter
    private String firstName;
    @Getter
    @Setter
    private String lastName;
    @Getter
    @Setter
    private String email;


    public Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return firstName + " " + StringUtils.capitalize(String.valueOf(lastName.charAt(0))) + " (" + email + ")";
    }
}
