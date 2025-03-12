package org.springboot.btvn_buoi1.Bai1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Vehical vehical;
    private Engine engine;

    @Autowired
    public Person(@Qualifier("car") Vehical vehical, @Qualifier("gasolineengine") Engine engine) {
        this.vehical = vehical;
        this.engine = engine;
    }

    public void call(){
        vehical.callName();
        engine.nameEngine();
    }
}
