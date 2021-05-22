package com.rpglojas.controller;

import com.rpglojas.models.Cidade;
import com.rpglojas.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/cidades")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping
    public List<Cidade> getCidades(){
        return cidadeService.getCidades();
    }

    @GetMapping("/{id}")
    public Cidade getCidade(@PathVariable Long id){
        return cidadeService.getCidade(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity removerCidade(@PathVariable Long id) {
        cidadeService.removerCidadePorId(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity adicionarCidade(@RequestBody Cidade cidade) {
        cidadeService.adicionarCidade(cidade);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity updateClient(@PathVariable Long id, @RequestBody Cidade cidade){
        Cidade cidadeAtual = cidadeService.getCidade(id);

        if(cidadeAtual != null){
            cidadeAtual.setNome(cidade.getNome());
            cidadeAtual.setTesouro(cidade.getTesouro());
            cidadeService.adicionarCidade(cidade);
        }

        return ResponseEntity.ok(cidadeAtual);
    }
}
