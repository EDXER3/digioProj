package com.example.digiotest.repository;

import com.example.digiotest.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

    @Query("SELECT COUNT(ss) FROM Student ss")
    int countAllStudent();

    //List<Student> findByNameContaining(String first_name);
    //List<Student> findByFeeLessThan(String last_name);
}
