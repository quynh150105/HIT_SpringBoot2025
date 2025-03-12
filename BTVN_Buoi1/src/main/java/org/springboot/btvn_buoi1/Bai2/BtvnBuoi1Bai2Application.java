package org.springboot.btvn_buoi1.Bai2;

import org.springboot.btvn_buoi1.Bai2.User.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BtvnBuoi1Bai2Application {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BtvnBuoi1Bai2Application.class, args);
        Customer customer = context.getBean(Customer.class);
        customer.call();
    }
}