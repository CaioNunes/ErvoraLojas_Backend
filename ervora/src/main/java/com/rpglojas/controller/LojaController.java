package com.rpglojas.controller;

import com.rpglojas.models.Cidade;
import com.rpglojas.models.Loja;
import com.rpglojas.service.CidadeService;
import com.rpglojas.service.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/lojas")
public class LojaController {

    @Autowired
    private LojaService lojaService;

    @GetMapping
    public List<Loja> getLojas(){
        return lojaService.getLojas();
    }

}
