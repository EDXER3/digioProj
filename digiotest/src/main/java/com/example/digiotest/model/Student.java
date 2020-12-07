package com.example.digiotest.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "Student")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private int id;
    private String first_name;
    private String last_name;
    private int year;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "student_subject",
            joinColumns = {
                    @JoinColumn(name = "student_id", referencedColumnName = "id",nullable = false,
                            updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "subject_id", referencedColumnName = "id",nullable = false,
                            updatable = false)})

    private Set<Subject> subject = new HashSet<>();

    public Student(){

    }

    public Student(int id){
        this.id=id;
    }

    public Student(String first_name,String last_name,int year){
        this.first_name=first_name;
        this.last_name  = last_name;
        this.year =year;
    }



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFistName() { return first_name; }
    public void setFirstName(String firstName) {
        this.first_name = firstName;
    }

    public String getLastName() { return last_name; }
    public void setLastName(String lastName) {
        this.last_name = lastName;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    //public Set<Subject> getSubject() { return subject; }


}
