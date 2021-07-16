package com.rpglojas.converters;

import com.rpglojas.dtos.PersonagemDTO;
import com.rpglojas.models.Personagem;

public class PersonagemConverter implements BaseConverter<Personagem, PersonagemDTO> {


    @Override
    public Personagem convertToEntity(PersonagemDTO dto) {
        Personagem personagem = new Personagem();
        personagem.setId(dto.getId());
        personagem.setNome(dto.getNome());
        personagem.setNpc(dto.getNpc());
        personagem.setTesouro(dto.getTesouro());
        personagem.setCidade(new CidadeConverter().convertToEntity(dto.getCidade()));
        personagem.setNpc(dto.getNpc());
        personagem.setEstiloVida(dto.getEstiloVida());
        personagem.setParticipanteGuilda(dto.getParticipanteGuilda());
        return personagem;
    }


    @Override
    public PersonagemDTO convertToDTO(Personagem p){
        PersonagemDTO dto = new PersonagemDTO();
        dto.setId(p.getId());
        dto.setNome(p.getNome());
        dto.setNpc(p.getNpc());
        dto.setTesouro(p.getTesouro());
        dto.setCidade(new CidadeConverter().convertToDTO(p.getCidade()));
        dto.setNpc(p.getNpc());
        dto.setEstiloVida(p.getEstiloVida());
        dto.setParticipanteGuilda(p.getParticipanteGuilda());

        return dto;
    }
}
