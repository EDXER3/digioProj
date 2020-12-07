package com.example.digiotest;

import com.example.digiotest.model.Stu_sub;
import com.example.digiotest.model.Student;
import com.example.digiotest.model.Subject;
import com.example.digiotest.model.Teacher;
import com.example.digiotest.repository.Stu_SubRepository;
import com.example.digiotest.repository.StudentRepository;
import com.example.digiotest.repository.SubjectRepository;
import com.example.digiotest.repository.TeacherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalTime;

@SpringBootApplication
public class DigiotestApplication {

    public static void main(String[] args) {

        SpringApplication.run(DigiotestApplication.class, args);

    }

    @Bean
    public CommandLineRunner mappingDemo(TeacherRepository tr,
                                         SubjectRepository subr,
                                         StudentRepository stur,
                                         Stu_SubRepository stu_subr) {
        return args -> {

            boolean start = true;
            if(start) {
                Teacher b = new Teacher("dsf", "asd", "CJ");

                for (int i = 0; i < 16; i++) {
                    String n = "";
                    String m = "";
                    int ii = 0;
                    if (i <=8) {
                        m = "a";
                        ii = i;
                    } else {
                        m = "b";
                        ii = i - 5;
                    }
                    for (int j = 0; j <= ii; j++) {
                        n = n + m;
                    }
                    if(i<=2){
                        tr.save(new Teacher(n, n.toUpperCase(), "IT"));
                    }else{
                        int iii = i-2;
                        float ll = Float.parseFloat(String.valueOf(iii));
                        String hr_st = String.valueOf(i+1);
                        String hr_of = String.valueOf(i+2);
                        LocalTime time_start = LocalTime.of(01+i, 00, 00, 000000000);
                        LocalTime time_off = LocalTime.of(03+i, 00, 00, 000000000);
                        //Date time_start = new Date(2020,12,11,01+i,00,22);
                        //Date time_off = new Date(2020,12,11,02+i,00,22);
                        Subject su = new Subject("Subject" + iii,"Sub" + iii, (float) 0.5 + ll ,time_start,time_off,tr.save(new Teacher(n, n.toUpperCase(), "IT")));
                        subr.save(su);
                    }

                }

                for (int i = 0; i < 2; i++) {
                    String n = "";
                    String m = "";
                    int ii = 0;
                    if (i < 5) {
                        m = "i";
                        ii = i;
                    } else {
                        m = "j";
                        ii = i - 5;
                    }
                    for (int j = 0; j <= ii; j++) {
                        n = n + m;
                    }

                    stur.save(new Student(n, n.toUpperCase(), ii + 1));

                }


                Student student1 =new Student(30);
                Student student2 =new Student(31);
                Subject subject1 =new Subject(5);
                Subject subject2 =new Subject(9);

                stu_subr.save(new Stu_sub(student1,subject1));
                stu_subr.save(new Stu_sub(student1,subject2));
                stu_subr.save(new Stu_sub(student2,subject2));



            }

        };
    }

}
