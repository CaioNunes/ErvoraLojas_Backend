package com.rpglojas.repository;

import com.rpglojas.models.Cidade;
import com.rpglojas.models.PorcentagemGastosEstiloVida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PorcentagemGastosEstiloVidaRepository extends JpaRepository<PorcentagemGastosEstiloVida, Long> {
}
