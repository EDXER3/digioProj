package com.example.digiotest.DTO;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.time.LocalTime;



@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class SubjectDTO {

    private int id;
    private String name_subject ;
    private String description;
    private float credit;
    private int teacher_id;

    private LocalTime time_start;

    private LocalTime time_off;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNameSubject() {
        return name_subject;
    }
    public void setNameSubject(String name_subject) {
        this.name_subject = name_subject;
    }

    public String getDescription() { return description; }
    public void setDescription(String description) {
        this.description = description;
    }

    public float getCredit() { return credit; }
    public void setCredit(float credit) {
        this.credit = credit;
    }

    public int getTeacherID() {return teacher_id;}
    public void setTeacherID(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public LocalTime getTimeStart() {return time_start;}
    public void setTimeStart(LocalTime time_start) {this.time_start = time_start; }

    public LocalTime getTimeOff() {return time_off;}
    public void setTimeOff(LocalTime time_off) {
        this.time_off = time_off;
    }
}
