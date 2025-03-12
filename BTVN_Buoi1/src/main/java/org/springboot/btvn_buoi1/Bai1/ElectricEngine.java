package org.springboot.btvn_buoi1.Bai1;

import org.springframework.stereotype.Component;

@Component
public class ElectricEngine implements Engine {
    @Override
    public void nameEngine() {
        System.out.println("This is ElectricEngine");
    }
}
