package org.springboot.btvn_buoi1.Bai2.service;

import org.springframework.stereotype.Component;

@Component
public class FastFoodOrder implements Order{
    @Override
    public void orderName() {
        System.out.println("fast food order");
    }
}
