package com.example.digiotest.repository;

import com.example.digiotest.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {

    //List<Subject> findByTitleContaining(String name_subject);

    //List<Subject> findByFeeLessThan(float credit);
}
