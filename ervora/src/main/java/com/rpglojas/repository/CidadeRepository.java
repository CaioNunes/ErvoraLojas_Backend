package com.rpglojas.repository;

import com.rpglojas.models.Cidade;
import com.rpglojas.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
