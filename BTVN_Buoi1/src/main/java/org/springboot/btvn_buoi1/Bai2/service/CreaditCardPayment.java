package org.springboot.btvn_buoi1.Bai2.service;

import org.springframework.stereotype.Component;

@Component
public class CreaditCardPayment implements PaymentMethod {
    @Override
    public void callPaymentMethod() {
        System.out.println("CreaditCardPayment");
    }
}
