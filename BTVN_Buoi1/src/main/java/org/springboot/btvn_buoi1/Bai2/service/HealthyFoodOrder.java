package org.springboot.btvn_buoi1.Bai2.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("HealthyFoodOrder")
@Primary
public class HealthyFoodOrder implements Order{
    @Override
    public void orderName() {
        System.out.println("healthy food order");
    }
}
