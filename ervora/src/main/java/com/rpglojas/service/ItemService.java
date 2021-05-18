package com.rpglojas.service;

import com.rpglojas.models.Item;
import com.rpglojas.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> getItens(){
        return itemRepository.findAll();
    }
}
