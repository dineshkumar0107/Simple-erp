package com.example.erpapp1.service;

import com.example.erpapp1.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ERPService {
    private  static final List<Student> students =new ArrayList<>();
     private static int rollno =0;

    static {
        Student s1 = new Student(++rollno,"Dinesh","male",
                List.of(80.0,90.0,60.0,70.0,78.0),"bareilly");
           students.add(s1);
        Student s2 = new Student(++rollno,"Anil","male",
                List.of(99.0,90.0,50.0,70.0,78.0),"baheri");
        students.add(s2);
        Student s3 = new Student(++rollno,"Aditya","male",
                List.of(80.0,90.0,60.0,90.0,88.0),"nawabganj");
        students.add(s3);
        Student s4 = new Student(++rollno,"Swati","female",
                List.of(80.0,90.0,80.0,80.0,78.0),"Dehradun");
        students.add(s4);
        Student s5 = new Student(++rollno,"Dimpal","female",
                List.of(80.0,40.0,60.0,50.0,78.0),"Pilibhit");
        students.add(s5);

    }
public List<Student> findAll(){
        return students;
}
public Student findById(int rollno){
        for(Student student:students){
            if(student.getRollNumber()==rollno) return student;
        }
        return null;
}
}
