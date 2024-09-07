package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.springcore.Coupling.*;
import org.springframework.context.annotation.ComponentScan;
import test.Test;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springcore","test"})
public class SpringCoreConceptsApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringCoreConceptsApplication.class, args);
        //Person personBean = applicationContext.getBean(Person.class);
        //personBean.playWithAnimal();

        Test testBean = applicationContext.getBean(Test.class);
        testBean.testing();

        //Beans and dependencies management
        //step 1- About beans (@Component)
        //step 2 - About dependencies (@Autowired)
        //step 3 - where to scan for beans - @SpringBootApplication allow us for ComponentScan built-in

//        Animal animal = new Cat();
//        Person person = new Person(animal);
//        person.playWithAnimal();
    }

}
