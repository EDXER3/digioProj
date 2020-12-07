package com.example.digiotest.repository;

import com.example.digiotest.model.Stu_sub;
import com.example.digiotest.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Stu_SubRepository extends CrudRepository<Stu_sub, Integer> {
    @Query("SELECT COUNT(ss) FROM Stu_sub ss WHERE ss.student_id=?1")
    int countRissubjectForStudent(Student student);
/*
    @Query("SELECT ss FROM Stu_sub ss WHERE ss.subject_id.id=?1")
    List<Stu_sub> findBySubject(int subject_id);

    @Query("SELECT COUNT(ss) FROM Stu_sub ss WHERE ss.subject_id.id=?1")
    int countBysubject(int subject_id);
*/
    @Query("SELECT COUNT(ss) FROM Stu_sub ss")
    int countRissubjectAll();

    @Query("SELECT COUNT(ss) FROM Stu_sub ss WHERE ss.subject_id.id=?1")
    int countRissubjectbysubject_id(int subject_id);

    @Query("SELECT ss FROM Stu_sub ss WHERE ss.subject_id.id=?1")
    Iterable<Stu_sub> findBySubject_id(int subject_id);

    @Query("SELECT ss FROM Stu_sub ss WHERE ss.subject_id.id=?1")
    List<Stu_sub> findToListBySubject_id(int subject_id);

    @Query("SELECT ss.subject_id.name_subject FROM Stu_sub ss WHERE ss.subject_id.id=?1")
    String findName_subjectBySubject_id(int subject_id);

}
