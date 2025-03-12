package org.springboot.btvn_buoi1.Bai1;

import org.springframework.stereotype.Component;

@Component
public class Motobike implements Vehical {
    @Override
    public void callName() {
        System.out.println("This is motobike");
    }

}
