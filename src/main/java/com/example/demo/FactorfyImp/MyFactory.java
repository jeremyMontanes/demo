package com.example.demo.FactorfyImp;

import com.example.demo.ComputerFactory.Factory;

public class MyFactory implements Factory {


    @Override
    public boolean CreateFactory(String name) {
        return true;
    }
}
