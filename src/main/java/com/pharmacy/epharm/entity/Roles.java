package com.pharmacy.epharm.entity;

import javax.persistence.Entity;

@Entity
public class Roles {
    private  Integer Id;
    private String name;

    public Roles(Integer id, String name) {
        Id = id;
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
