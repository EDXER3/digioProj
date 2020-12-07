package com.example.digiotest.DTO;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;


@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class TeacherDTO {


    private int id;
    private String fist_name;
    private String last_name;
    private String major;



    public long getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() { return fist_name; }
    public void setFirstName(String fistName) {
        this.fist_name = fistName;
    }
    public String getLastName() { return last_name; }
    public void setLastName(String lastName) {
        this.last_name = lastName;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }


}
