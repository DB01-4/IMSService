package com.example.imsservice.service;

import com.example.imsservice.entity.Item;
import com.example.imsservice.repository.IMSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.repository.query.parser.Part;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class IMSService {

    @Autowired
    private IMSRepository repository;

    //get all Items
    public List<Item> getItems() {
        return repository.findAll();
    }


    public Item saveItem(Item item) {
        return repository.save(item);
    }


    //update Item
    public Item UpdateQR(int id){
        return null;
    }

}
