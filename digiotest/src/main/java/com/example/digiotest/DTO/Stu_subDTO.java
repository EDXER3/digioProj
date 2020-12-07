package com.example.digiotest.DTO;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.io.Serializable;


@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Stu_subDTO implements Serializable {

    private int id;
    private int student_id;
    private int subject_id;

    public int getId() { return id;}
    public void setId(int id) {this.id = id;}

    public int getstudentId() { return student_id;}
    public void setstudentId(int student_id) {this.student_id = student_id;}

    public int getsubjectId() { return subject_id;}
    public void setsubject_Id(int subject_id) {this.subject_id = subject_id;}
}
