package com.rpglojas.repository;

import com.rpglojas.dtos.PersonagemDTO;
import com.rpglojas.models.Missao;
import com.rpglojas.models.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MissaoRepository extends JpaRepository<Missao, Long> {

    @Query(
        value = "SELECT new com.rpglojas.dtos.PersonagemDTO (p.id, p.nome, p.tesouro, p.cidade.id, p.cidade.nome, p.cidade.tesouro, p.isNpc, p.isParticipanteGuilda) FROM Personagem p JOIN p.missoes missoes WHERE missoes.idMissao = ?1"
    )
    List<PersonagemDTO> consultarParticipantesMissao(Long idMissao);

}
