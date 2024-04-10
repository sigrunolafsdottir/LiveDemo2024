package com.example.demo.Telefonbok;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class KompisController {

    KompisDAO kd = new KompisDAO();
    List<Kompis> kompisar = kd.fillList();

    @RequestMapping("/allaKompisar")
    public List<Kompis> getAllFriends(){
        return kompisar;
    }

    @RequestMapping("/getKompisById/{id}")
    public Kompis getFriendById(@PathVariable int id){
        int temp=-1;
        for (int i = 0; i < kompisar.size(); i++){
            if (kompisar.get(i).getId() == id){
                temp=i;
            }
        }
        if(temp != -1){
            return kompisar.get(temp);
        }
        else return null;
    }

    @RequestMapping("/getKompisByIdStreams/{id}")
    public List<Kompis> getFriendByIdStreams(@PathVariable int id){
        return kompisar.stream().filter(k -> k.getId()==id).collect(Collectors.toList()); //.findFirst().orElse(null);
    }

}
