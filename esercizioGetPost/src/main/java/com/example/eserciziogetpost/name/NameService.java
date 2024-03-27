package com.example.eserciziogetpost.name;

import org.springframework.stereotype.Service;

@Service
public class NameService {
    Name name = new Name("Jhon");

    public String getName (){

        return name.getName();
    }

    public String reverseName(String name) {
        StringBuilder reversedName = new StringBuilder(name).reverse();
        return reversedName.toString();
    }
    

}
