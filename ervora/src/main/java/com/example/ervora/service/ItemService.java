package com.example.ervora.service;

import com.example.ervora.models.Item;
import com.example.ervora.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> getItens(){
        return itemRepository.findAll();
    }
}
