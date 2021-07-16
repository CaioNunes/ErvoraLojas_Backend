package com.rpglojas.service;

import com.rpglojas.converters.ItemLojaConverter;
import com.rpglojas.converters.PersonagemConverter;
import com.rpglojas.dtos.*;
import com.rpglojas.models.ComprasLoja;
import com.rpglojas.models.ItemLoja;
import com.rpglojas.models.Loja;
import com.rpglojas.models.Personagem;
import com.rpglojas.repository.ComprasRepository;
import com.rpglojas.repository.ItemLojaRepository;
import com.rpglojas.repository.LojaRepository;
import com.rpglojas.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LojaService {

    @Autowired
    LojaRepository lojaRepository;

    @Autowired
    ComprasService comprasService;

    @Autowired
    ItemLojaRepository itemLojaRepository;

    @Autowired
    PersonagemRepository personagemRepository;

    @Autowired
    ComprasRepository comprasRepository;


    public List<Loja> getLojas(){
        return lojaRepository.findAll();
    }

    public void adicionarItemLoja(){

    }

    public void comprarItem(Long idPersonagem, Long idItem, Integer qntAdquirida){
        Personagem personagem = personagemRepository.findById(idItem).get();

        // 1 - preencher dados da compra
        ComprasLoja compra = new ComprasLoja();
        compra.setQuantidadeAdquirida(qntAdquirida);
        compra.setComprador(personagem);

        // 2 - diminuir quantidade na loja
        Optional<ItemLoja> itemLojaOptional = itemLojaRepository.findById(idItem);

        if(itemLojaOptional.isPresent()){
            ItemLoja itemLoja = itemLojaOptional.get();
            itemLoja.setQuantidade(itemLoja.getQuantidade() - qntAdquirida);
            itemLojaRepository.save(itemLoja);

            compra.setItemAdquirido(itemLoja);
            // 3 - armazenar compra
            comprasService.salvarCompra(compra);
        }

        // 5 - descontar dinheiro do personagem
        // TODO: 23/05/2021
    }


    public List<ComprasLojaDTO> consultarComprasLoja(Long id){
        List<ComprasLoja> data = comprasRepository.consultarComprasLoja(id);

        List<ComprasLojaDTO> compras = new ArrayList<>();

        if(data != null) {
            data.forEach(compra -> compras.add(new ComprasLojaDTO(compra.getId(), compra.getQuantidadeAdquirida(), new PersonagemConverter().convertToDTO(compra.getComprador()), new ItemLojaConverter().convertToDTO(compra.getItemAdquirido()))));
        }

        return compras;

    }

}
