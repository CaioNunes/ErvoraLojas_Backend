package com.rpglojas.repository;

import com.rpglojas.models.Item;
import com.rpglojas.models.ItemQualidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemQualidadeRepository extends JpaRepository<ItemQualidade, Long> {
}
