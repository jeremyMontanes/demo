package com.example.demo.Controller;

import com.example.demo.ComputerFactory.Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @Autowired
    private ServiceComputer serviceComputer;

    @GetMapping(value ="/name/{name}")
    public boolean addComputeur(@PathVariable("name") String name)
    {
        boolean res = false;
        factory.CreateFactory(name);
        return res;
    }

    @GetMapping(value = "/asagi")
    @ResponseBody
    public String afficherUnProduit() {
        return "asagi  ";
    }

}
