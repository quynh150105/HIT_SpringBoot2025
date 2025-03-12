package org.springboot.btvn_buoi1.Bai1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BtvnBuoi1Bai1Application {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BtvnBuoi1Bai1Application.class, args);
        Person person = context.getBean("person",Person.class);
        person.call();
    }
}