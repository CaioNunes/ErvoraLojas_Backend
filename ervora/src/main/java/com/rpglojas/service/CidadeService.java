package com.rpglojas.service;

import com.rpglojas.models.Cidade;
import com.rpglojas.models.Item;
import com.rpglojas.repository.CidadeRepository;
import com.rpglojas.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    CidadeRepository cidadeRepository;

    public List<Cidade> getCidades(){
        return cidadeRepository.findAll();
    }

}
