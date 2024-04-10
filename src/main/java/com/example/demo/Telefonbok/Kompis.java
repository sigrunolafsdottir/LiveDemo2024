package com.example.demo.Telefonbok;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kompis {
    protected int id;
    protected String name;
    protected String mobile;
    protected String address;
}
