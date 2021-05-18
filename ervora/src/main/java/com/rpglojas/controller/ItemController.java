package com.rpglojas.controller;

import com.rpglojas.models.Item;
import com.rpglojas.service.ItemService;
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
