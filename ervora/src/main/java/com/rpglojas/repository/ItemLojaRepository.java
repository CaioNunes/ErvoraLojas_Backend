package com.rpglojas.repository;

import com.rpglojas.models.ComprasLoja;
import com.rpglojas.models.Item;
import com.rpglojas.models.ItemLoja;
import com.rpglojas.models.TipoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemLojaRepository extends JpaRepository<ItemLoja, Long> {

    @Query(
            value = "SELECT i FROM ItemLoja i WHERE i.loja.id = ?1  AND i.item.tipoItem.id = ?2"
    )
    List<ItemLoja> consultarItensPorLojaETipo(Long idLoja, Long codTipoItem);


}
