package org.springboot.btvn_buoi1.Bai2.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("PaypalPayment")
@Primary
public class PayPalPayment implements PaymentMethod{
    @Override
    public void callPaymentMethod() {
        System.out.println("PayPalPayment");
    }
}
