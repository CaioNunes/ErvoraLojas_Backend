package com.rpglojas.service;

import com.rpglojas.dtos.ItemLojaDTO;
import com.rpglojas.dtos.PersonagemDTO;
import com.rpglojas.models.*;
import com.rpglojas.repository.ComprasRepository;
import com.rpglojas.repository.ItemLojaRepository;
import com.rpglojas.repository.ItemTipoRepository;
import com.rpglojas.repository.PorcentagemGastosEstiloVidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

@Service
public class ComprasService {

    @Autowired
    private ComprasRepository comprasRepository;

    @Autowired
    private LojaService lojaService;

    @Autowired
    private PersonagemService personagemService;

    @Autowired
    private PorcentagemGastosEstiloVidaRepository porcentagemRepository;

    @Autowired
    private ItemTipoRepository itemTipoRepository;

    @Autowired
    private ItemLojaRepository itemLojaRepository;


    public void consultarComprasPersonagem(){

    }

    public void consultarComprasLoja(){

    }

    public void salvarCompra(ComprasLoja compra){
        comprasRepository.save(compra);
    }


    // JOB que realiza as compras semanais dos npcs
    private void executarComprasNPCs(){

        // 1 - Lista de NPCS
        //todo incluir inventário do personagem, pra saber quanto dinheiro ele tem disponível
        List<PersonagemDTO> npcs = personagemService.listarNpcs();

        // 2 - Porcentagens de cada npc ( Agora está genérica para cada tipo de item)
        List<PorcentagemGastosEstiloVida> porcentagens = porcentagemRepository.findAll();

        // 3 - Lista de lojas da cidade que ele está
        List<Loja> lojas = lojaService.getLojas();



        // 4 - Lista de ItemTipo
        List<ItemTipo> tipos = itemTipoRepository.findAll();

        // 4 - Passa por cada categoria de item, computa a respectiva quantia de dinheiro baseada na porcentagem cadastrada, e compra um item de cada tipo em cada loja. Se sobrar, economiza
        for(PersonagemDTO npc : npcs){
            EstiloVida estilo = npc.getEstiloVida();
            double valorTotal = 0; // todo mudar para valor total consultado do inventário

            for(ItemTipo categoria: tipos){
                // Pra cada categoria, cálculo o valor baseado no montante total atual, independente do tanto que ele vai economizar.
                double valorASerGasto = valorTotal * (consultarPercentualEstiloVidaItem(estilo, categoria)).doubleValue();


                for(Loja loja: lojas){
                    List<ItemLoja> itens = itemLojaRepository.consultarItensPorLojaETipo(loja.getId(), categoria.getId());
                    //iterar sobre as lojas, sobre os itens de cada loja e comprar um item de cada categoria
                    int indexItem = getRandomNumber(0, itens.size());

                    ItemLoja item = itens.get(indexItem);

                    if(item.getItem().getTipoItem().getId() == categoria.getId()) {
                        // faz a Compra do item
                        // desconta o valor do item do valorASerGasto
//                        valorASerGasto = (valorASerGasto - item.getPreco().doubleValue());
                    }

                }


            }
        }

        // 6 - reajustar preços dos vendedores que menos venderam ( ? )

    }

    private BigDecimal consultarPercentualEstiloVidaItem(EstiloVida estilo, ItemTipo itemTipo){
        List<PorcentagemGastosEstiloVida> porcentagens = porcentagemRepository.findAll();

        for(PorcentagemGastosEstiloVida porcentagem: porcentagens){
            if(estilo.getId() == porcentagem.getId()) {
                if(itemTipo.getId() == porcentagem.getTipoItem().getId()){
                    return porcentagem.getPercentualGasto();
                }
            }
        }

        return BigDecimal.ZERO;
    }

    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
