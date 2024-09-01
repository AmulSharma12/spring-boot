package com.springcore.Coupling;

import org.springframework.stereotype.Component;

@Component

public class Cat implements Animal{
    public void play(){
        System.out.println("Cat is playing");
    }
}
