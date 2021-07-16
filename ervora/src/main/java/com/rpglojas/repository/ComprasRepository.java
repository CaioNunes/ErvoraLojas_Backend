package com.rpglojas.repository;

import com.rpglojas.dtos.PersonagemDTO;
import com.rpglojas.models.ComprasLoja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComprasRepository extends JpaRepository<ComprasLoja, Long> {

    @Query(
            value = "SELECT c FROM ComprasLoja c WHERE c.itemAdquirido.loja.id = ?1"
    )
    List<ComprasLoja> consultarComprasLoja(Long idLoja);

}
