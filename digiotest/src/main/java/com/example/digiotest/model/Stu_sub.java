package com.example.digiotest.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "student_subject")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Stu_sub implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private int id;


    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "student_id" ,nullable = false)
    private Student student_id;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "subject_id" ,nullable = false)
    private Subject subject_id;

    public Stu_sub() {

    }

    public Stu_sub(int id) {this.id = id;}

    public Stu_sub(Student student_id,Subject subject_id) {
        super();
        this.student_id = student_id;
        this.subject_id = subject_id;
    }

    public int getId() { return id;}
    public void setId(int id) {this.id = id;    }

    public Student getstudentId() { return student_id;}
    public void setstudentId(Student student_id) {this.student_id = student_id;    }

    public Subject getsubjectId() { return subject_id;}
    public void setsubject_Id(Subject subject_id) {this.subject_id = subject_id;    }
}
