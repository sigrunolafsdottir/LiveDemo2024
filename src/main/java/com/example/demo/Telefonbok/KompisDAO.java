package com.example.demo.Telefonbok;

import java.util.ArrayList;
import java.util.List;

public class KompisDAO {

    List<Kompis> kompisar = new ArrayList<>();

    Kompis k1= new Kompis(1, "Sigrun", "123456", "Hemma");
    Kompis k2= new Kompis(2, "Albert", "7654433", "Hemma hos Berta");
    Kompis k3= new Kompis(3, "Berta", "2453645", "Hemma hos Albert");

    public List<Kompis> fillList( ){
        kompisar.add(k1);
        kompisar.add(k2);
        kompisar.add(k3);
        return kompisar;
    }

}
