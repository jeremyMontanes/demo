package com.example.demo.Data;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class Computer {

    @Id
    public String name;

    public LocalDate dateEntre;

    public LocalDate dateSortie;

    public String manifacteur;
}
