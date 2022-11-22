package com.java.mingke.demo.student;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    public List<Student> allStudents(){
        return List.of(
                new Student(
                        1L,
                        "Mingke",
                        "mingked@utas.edu.au",
                        LocalDate.of(1999, Month.MAY,12),
                        7.0
                )
        );
    }
}
