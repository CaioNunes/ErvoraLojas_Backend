package com.rpglojas.controller;

import com.rpglojas.dtos.DataDTO;
import com.rpglojas.dtos.ParDataDTO;
import com.rpglojas.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/calendario")
public class CalendarioController {

    @Autowired
    private CalendarioService calendarioService;

    @GetMapping("/dataAtual")
    public DataDTO getDataAtual(){
        return calendarioService.obterDataAtual();
    }

    @GetMapping("/diasEntreDatas")
    public Integer getDiasEntreDatas(@RequestBody ParDataDTO datas){
        return calendarioService.quantidadeDiasEntreDatas(datas.getDataAnterior(), datas.getDataPosterior());
    }

    @GetMapping("/obterProximoDia")
    public DataDTO getProximoDia(@RequestBody DataDTO dataAtual) {
        return calendarioService.obterProximoDia(dataAtual);
    }

    //Alternar passagem Manual/Automática

    //Verificar qual data deveria ser

    //Verificar próximo dia maldito

}
