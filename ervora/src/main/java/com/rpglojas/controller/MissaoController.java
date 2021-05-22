package com.rpglojas.controller;

import com.rpglojas.dtos.PersonagemDTO;
import com.rpglojas.models.Personagem;
import com.rpglojas.service.MissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value="/missoes")
public class MissaoController {

    @Autowired
    private MissaoService missaoService;

    @GetMapping("/{id}")
    public List<PersonagemDTO> listarParticipantesDaMissao(@PathVariable Long id){
        return missaoService.listarParticipantesMissao(id);
    }

}
