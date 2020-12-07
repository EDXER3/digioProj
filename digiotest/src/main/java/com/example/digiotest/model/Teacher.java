package com.example.digiotest.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "teacher")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Teacher implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String first_name;
    private String last_name;
    private String major;

/*
    @OneToOne(mappedBy = "teacher",fetch = FetchType.LAZY,optional = false)
    private Subject subject;
*/


    public Teacher(){

    }

    public Teacher(int id){
        this.id = id;
    }

    public Teacher(String first_name,String last_name,String major){
        this.first_name=first_name;
        this.last_name=last_name;
        this.major=major;
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

    public String getMajor() {return major;}
    public void setMajor(String major) { this.major = major;}
/*
    public Subject getSubject(){return subject; }
    public  void  setSubject(Subject subject){ this.subject=subject; }

 */


}
