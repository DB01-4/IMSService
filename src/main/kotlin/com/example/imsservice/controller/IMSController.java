package com.example.imsservice.controller;
import com.example.imsservice.entity.Item;
import com.example.imsservice.service.IMSService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="*")
@RequestMapping("api/")
@RestController
public class IMSController {

    @Autowired
    private IMSService service;

    //Get qr codes
    @GetMapping("items")
    public List<Item> getItems() {
        return service.getItems();
    }

    @GetMapping("item/{id}")
    public Item getItemById(@PathVariable int id) {
        return service.getItemById(id);
    }

    @PutMapping("item/update/{id}")
    public void updateItemById(@RequestBody Item item, @PathVariable int id) {
        service.updateItemById(item, id);
    }

    @PutMapping("item/decrease/{name}/{value}")
    public void updateItemQuantityByName(@PathVariable String name, @PathVariable int value) {
        service.updateItemQuantityByName(name, value);
    }

    @PostMapping("item/post")
    public Item addItem(@RequestBody Item item) {
        return service.saveItem(item);
    }

    @DeleteMapping("item/delete/{id}")
    public void deleteItem(@PathVariable int id) {
        service.deleteItem(id);
    }


}
