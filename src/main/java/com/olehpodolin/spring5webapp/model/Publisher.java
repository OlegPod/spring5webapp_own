package com.olehpodolin.spring5webapp.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Publisher {
    private String name;
    private String adress;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Publisher(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

     void setAdress(String adress) {
        this.adress = adress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
