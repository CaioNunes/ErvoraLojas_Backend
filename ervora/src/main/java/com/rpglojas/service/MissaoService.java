package com.rpglojas.service;

import com.rpglojas.dtos.PersonagemDTO;
import com.rpglojas.models.Missao;
import com.rpglojas.models.Personagem;
import com.rpglojas.repository.MissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MissaoService {

    @Autowired
    MissaoRepository missaoRepository;

    public List<Missao> listarMissoes() {
        return missaoRepository.findAll();
    }

    public List<PersonagemDTO> listarParticipantesMissao(Long idMissao){
        List<PersonagemDTO> participantes = missaoRepository.consultarParticipantesMissao(idMissao);

        return participantes;
    }

}
