package com.example.demo.Controller;

import com.example.demo.ComputerFactory.Factory;
import com.example.demo.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @Autowired
    private IService serviceComputer;

    @GetMapping(value ="/name/{name}")
    public boolean addComputeur(@PathVariable("name") String name)
    {
        boolean res = false;
        res = serviceComputer.addComputer(name);
        return res;
    }

    @GetMapping(value = "/asagi")
    @ResponseBody
    public String afficherUnProduit() {
        return "asagi  ";
    }

}
