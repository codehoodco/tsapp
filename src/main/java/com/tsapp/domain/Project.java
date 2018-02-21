package com.tsapp.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

public class Project {

    @Getter
    @Setter
    @Id
    private String id;

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String companyName;
    @Getter
    @Setter
    private String contactName;
    @Getter
    @Setter
    private String contactEmail;


    public Project(String name, String companyName, String contactName, String contactEmail) {
        this.name = name;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
    }

    @Override
    public String toString() {
        return name + " (" + companyName + ")";
    }
}
