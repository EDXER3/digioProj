package com.example.digiotest.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "subject")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Subject implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "name_subject")
    private String name_subject;
    @Column(name = "description")
    private String description;
    @Column(name = "credit")
    private float credit;
//    @Column(name = "teacher_id")
//    private int teacher_id;
    private LocalTime time_start;
    private LocalTime time_off;


    @OneToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "teacher_id" ,nullable = false)
    private Teacher teacher;


    @ManyToMany(mappedBy = "subject",fetch = FetchType.LAZY)
    private Set<Student> students = new HashSet<>();

    //Getters and setters omitted for brevity
    public Subject(){

    }

    public Subject(int id){
        this.id = id;
    }

    public Subject(String name_subject,String description,float credit,LocalTime time_start, LocalTime time_off,Teacher teacher){
        super();
        this.name_subject=name_subject;
        this.description=description;
        this.credit=credit;

        this.time_start=time_start;
        this.time_off=time_off;
        this.teacher=teacher;
    }

    
    public int getId() { return id;}
    public void setId(int id) {this.id = id;    }

    public String getNameSubject() { return name_subject;}
    public void setNameSubject(String name_subject) {this.name_subject = name_subject;}

    public String getDescription() { return description; }
    public void setDescription(String description) {this.description = description;}

    public float getCredit() { return credit; }
    public void setCredit(float credit) {this.credit = credit;    }

//    public int getTeacherID() {return teacher_id;}
//    public void setTeacherID(int teacher_id) { this.teacher_id = teacher_id; }

    public LocalTime getTimeStart() {return time_start;}
    public void setTimeStart(LocalTime time_start) {this.time_start = time_start; }

    public LocalTime getTimeOff() {return time_off;}
    public void setTimeOff(LocalTime time_off) {this.time_off = time_off; }

    public Teacher getTeacher(){return teacher; }
    public void setTeacher(Teacher teacher){ this.teacher = teacher; }
}
