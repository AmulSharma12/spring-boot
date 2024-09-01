package com.springcore.Coupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    //now at run time we cant been able to chnage the animal
    //means the Animal is tightly coupled with Person
    @Autowired
   Animal animal;
   public Person(Animal animal){
       this.animal = animal;
   }
    public void playWithAnimal(){
        animal.play();
    }
}
