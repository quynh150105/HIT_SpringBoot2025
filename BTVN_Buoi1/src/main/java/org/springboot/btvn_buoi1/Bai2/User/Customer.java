package org.springboot.btvn_buoi1.Bai2.User;

import org.springboot.btvn_buoi1.Bai2.service.Order;
import org.springboot.btvn_buoi1.Bai2.service.PaymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    private Order order;
    private PaymentMethod paymentMethod;

    @Autowired
    public Customer(@Qualifier("HealthyFoodOrder") Order order, @Qualifier("PaypalPayment") PaymentMethod paymentMethod){
        this.order = order;
        this.paymentMethod = paymentMethod;
    }

    public void call(){
        order.orderName();
        paymentMethod.callPaymentMethod();
    }
}

