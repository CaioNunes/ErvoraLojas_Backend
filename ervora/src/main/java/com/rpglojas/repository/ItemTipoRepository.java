package com.rpglojas.repository;

import com.rpglojas.models.Cidade;
import com.rpglojas.models.ItemTipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemTipoRepository extends JpaRepository<ItemTipo, Long> {
}
