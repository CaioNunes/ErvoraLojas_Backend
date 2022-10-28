package com.rpglojas.controller;

import com.rpglojas.dtos.ItemDTO;
import com.rpglojas.models.Item;
import com.rpglojas.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @PostMapping
    public ResponseEntity cadastrarItem(@Valid @RequestBody ItemDTO item) {
        itemService.cadastrarItem(item);
        return ResponseEntity.ok().build();
    }

}
