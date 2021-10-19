package com.example.imsservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "item")

public class Item {

    @Id
    public int id;
    public String name;
    public String type;
    public double quantity;


}