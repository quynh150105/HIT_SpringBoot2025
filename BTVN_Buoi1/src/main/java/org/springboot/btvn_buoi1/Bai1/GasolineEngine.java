package org.springboot.btvn_buoi1.Bai1;

import org.springframework.stereotype.Component;

@Component("gasolineengine")
public class GasolineEngine implements Engine {
    @Override
    public void nameEngine() {
        System.out.println("This is GasolineEngine");
    }
}
