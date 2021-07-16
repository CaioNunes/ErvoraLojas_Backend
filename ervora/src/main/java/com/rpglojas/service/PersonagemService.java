package com.rpglojas.service;

import com.rpglojas.converters.PersonagemConverter;
import com.rpglojas.dtos.PersonagemDTO;
import com.rpglojas.models.Personagem;
import com.rpglojas.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonagemService {

    @Autowired
    PersonagemRepository personagemRepository;

    public List<Personagem> getPersonagens(){
        return personagemRepository.findAll();
    }

    public void removerPersonagemPorId(Long id){
        personagemRepository.deleteById(id);
    }

    public Personagem getPersonagem(Long id){
        Optional<Personagem> personagemData = personagemRepository.findById(id);

        if(personagemData.isPresent()){
            return personagemData.get();
        } else {
            return null;
        }
    }

    public void adicionarPersonagem(Personagem personagem){
        personagemRepository.save(personagem);
    }

    public List<PersonagemDTO> listarNpcs(){
        List<Personagem> npcs = personagemRepository.consultarNpcs();

        List<PersonagemDTO> npcsDTO = new ArrayList<>();

        if(npcs != null && !npcs.isEmpty()){
            PersonagemConverter converter = new PersonagemConverter();
            npcs.forEach(npc -> npcsDTO.add(converter.convertToDTO(npc)));
        }

        return npcsDTO;

    }

}
