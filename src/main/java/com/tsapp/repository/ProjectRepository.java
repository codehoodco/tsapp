package com.tsapp.repository;


import com.tsapp.domain.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProjectRepository extends MongoRepository<Project, String> {

    Project findByContactEmail(String contactEmail);

    List<Project> findByName(String name);

    List<Project> findByContactName(String contactName);

    Project findByCompanyName(String companyName);

    Project findByCompanyNameAndContactName(String companyName, String contactName);

    @Query("{companyName: {$regex: ?0}}")
    Project findByCompanyNameStartingWithCharacterSequenceIgnoreCase(String charSequence);

}