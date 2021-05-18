package com.rpglojas.service;

import com.rpglojas.models.Cidade;
import com.rpglojas.models.Loja;
import com.rpglojas.repository.CidadeRepository;
import com.rpglojas.repository.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LojaService {

    @Autowired
    LojaRepository lojaRepository;

    public List<Loja> getLojas(){
        return lojaRepository.findAll();
    }

}
