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

    public Item getItemById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Item saveItem(Item item) {
        return repository.save(item);
    }

    public void deleteItem(int id) {repository.deleteById(id);}

    public Item updateItemById(Item newItem, int id) {
        return repository.findById(id)
                .map(item -> {
                    item.setName(newItem.getName());
                    item.setQuantity(newItem.getQuantity());
                    return repository.save(item);
                })
                .orElseGet(() -> {
                    newItem.setId(id);
                    return repository.save(newItem);
                });
    }

    public Item updateItemQuantityByName(String name, int value) {
        Item item = repository.findByName(name).get(0);
        System.out.println(item.quantity);
        item.quantity -= value;
        return repository.save(item);
    }


    //update Item

}
