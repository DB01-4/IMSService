package com.example.imsservice.repository;

import com.example.imsservice.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IMSRepository extends JpaRepository<Item, Integer> {
    List<Item> findByName(String name);
}