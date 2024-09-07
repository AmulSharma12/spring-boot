package com.springcore.Coupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Animal animal;
    private Student student;


   //constructor injection preferred when the dependency is must  or compulsory need to inject
   @Autowired
   public Person(Animal animal, Student student){
       System.out.println("------------------------- Constructor Injection ================================");
       System.out.println("constructor injection -  applied in Person constructor for injecting animal dependency");
       System.out.println(animal + " " + this.animal + " " + student + " " + this.student);
       this.animal = animal;
       this.student = student;
       System.out.println(animal + " " + this.animal + " " + student + " " + this.student);
   }


    public void playWithAnimal(){
        animal.play();
        student.getDetails();
    }
}
