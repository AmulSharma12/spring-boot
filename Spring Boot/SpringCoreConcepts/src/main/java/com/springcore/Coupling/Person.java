package com.springcore.Coupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Autowired
    private Animal animal;
    @Autowired
    private Student student;


   //constructor injection preferred when the dependency is must  or compulsory need to inject
//   @Autowired
//   public Person(Animal animal, Student student){
//       System.out.println("------------------------- Constructor Injection ================================");
//       System.out.println("constructor injection -  applied in Person constructor for injecting animal dependency");
//       System.out.println(animal + " " + this.animal + " " + student + " " + this.student);
//       this.animal = animal;
//       this.student = student;
//       System.out.println(animal + " " + this.animal + " " + student + " " + this.student);
//   }


    //setter injection for Animal & student both
    public Animal getAnimal(){return this.animal;}
    public Student getStudent(){return this.student;}

//    @Autowired
    public void setAnimal(Animal animal){
        System.out.println("------------------------- Setter Injection -Animal ================================");
        System.out.println("Setter injection -  applied in Person constructor for injecting animal & student dependency");
        System.out.println(animal + " " + this.animal);
        this.animal = animal;
    }

//    @Autowired
    public void setStudent(Student student){
        System.out.println("------------------------- Setter Injection - Student ================================");
        System.out.println("Setter injection -  applied in Person constructor for injecting animal & student dependency");
        System.out.println(student + " " + this.student);
        this.student = student;
    }

    public void playWithAnimal(){
        animal.play();
        student.getDetails();
    }
}
