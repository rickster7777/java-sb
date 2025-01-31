package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired // field Injection
    //private Laptop laptop;
    @Qualifier("desktop")
    private Computer comp;
    // Constructor Injection
    // public Dev(Laptop laptop) {
    //     this.laptop = laptop;
    // }

    //Setter Injection
    // @Autowired
    // public void setLaptop(Laptop laptop) {
    //     this.laptop = laptop;
    // }

    public void build() {
        comp.compile();

        System.out.println("Working on awesome project");
    }
}
