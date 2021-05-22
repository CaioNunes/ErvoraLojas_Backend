package com.rpglojas.controller;

import com.rpglojas.models.Personagem;
import com.rpglojas.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/personagens")
public class PersonagemController {

    @Autowired
    private PersonagemService personagemService;

    @GetMapping
    public List<Personagem> getPersonagens(){
        return personagemService.getPersonagens();
    }

    @GetMapping("/{id}")
    public Personagem getPersonagem(@PathVariable Long id){
        return personagemService.getPersonagem(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity removerPersonagem(@PathVariable Long id) {
        personagemService.removerPersonagemPorId(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity adicionarPersonagem(@RequestBody Personagem personagem) {
        personagemService.adicionarPersonagem(personagem);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity atualizarPersonagem(@PathVariable Long id, @RequestBody Personagem personagem){
        Personagem personagemAtual = personagemService.getPersonagem(id);

        if(personagemAtual != null){
            personagemAtual.setNome(personagem.getNome());
            personagemAtual.setTesouro(personagem.getTesouro());
            personagemAtual.setCidade(personagem.getCidade());
            personagemService.adicionarPersonagem(personagem);
        }

        return ResponseEntity.ok(personagemAtual);
    }
}
