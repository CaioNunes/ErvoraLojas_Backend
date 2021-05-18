package com.example.ervora.controller;

import com.example.ervora.models.Item;
import com.example.ervora.repository.ItemRepository;
import com.example.ervora.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/itens")
public class ItemController {

    @Autowired
    private ItemService itemService;


    @GetMapping
    public List<Item> getItens(){
        return itemService.getItens();
    }
}
