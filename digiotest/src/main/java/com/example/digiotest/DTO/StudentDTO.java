package com.example.digiotest.DTO;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.io.Serializable;



@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class StudentDTO implements Serializable {
    private int id;
    private String first_name;
    private String last_name;
    private int year;

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
