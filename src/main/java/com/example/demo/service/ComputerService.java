package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ComputerService implements IService {
    @Override
    public boolean addComputer(String name) {
        return true;
    }
}
