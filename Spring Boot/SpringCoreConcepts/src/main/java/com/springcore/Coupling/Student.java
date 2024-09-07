package com.springcore.Coupling;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public Student(){
        System.out.println("Student class - student constructor used");
    }

    public void getDetails(){
        System.out.println("Student class - student details");
    }
}
