package org.springboot.btvn_buoi1;

import org.springboot.btvn_buoi1.Bai2.User.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BtvnBuoi1Application {
    public static void main(String[] args) {
        //SpringApplication.run(BtvnBuoi1Application.class, args);
        ApplicationContext context = SpringApplication.run(BtvnBuoi1Application.class, args);
        Customer customer = context.getBean("customer",Customer.class);
        customer.call();
    }
}