package com.rpglojas.controller;

import com.rpglojas.dtos.CompraChaveDTO;
import com.rpglojas.dtos.ComprasLojaDTO;
import com.rpglojas.dtos.ItemLojaDTO;
import com.rpglojas.dtos.PersonagemDTO;
import com.rpglojas.models.Cidade;
import com.rpglojas.models.ComprasLoja;
import com.rpglojas.models.Loja;
import com.rpglojas.models.Personagem;
import com.rpglojas.service.CidadeService;
import com.rpglojas.service.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/comprar")
    public void comprarItem(@RequestBody CompraChaveDTO compra){
        lojaService.comprarItem(compra.getIdComprador(), compra.getIdItemLoja(), compra.getQntAdquirida());
    }

    @GetMapping(value = "/compras/{id}")
    public ResponseEntity consultarComprasLoja(@PathVariable Long id){
        List<ComprasLojaDTO> compras =  lojaService.consultarComprasLoja(id);
        return ResponseEntity.ok(compras);
    }

}
