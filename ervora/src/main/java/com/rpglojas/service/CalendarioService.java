package com.rpglojas.service;

// Calendário próprio pra Redzay

import com.rpglojas.dtos.DataDTO;
import com.rpglojas.enums.DataAnteriorDiaMalditoEnum;
import com.rpglojas.enums.DiaEnum;
import com.rpglojas.enums.MesEnum;
import com.rpglojas.enums.SemanaEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@Service
public class CalendarioService {

    private static final Logger logger = LoggerFactory.getLogger(CalendarioService.class);

    private final SemanaEnum PRIMEIRA_SEMANA = SemanaEnum.PRIMO;
    private final DiaEnum PRIMEIRO_DIA = DiaEnum.PRIMO;
    private final MesEnum PRIMEIRO_MES = MesEnum.ATHREOS;
    private final Integer ANO_BASE = 1322;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    //todo buscar da base de dados
    private final String DATA_BASE_MUNDO_REAL_STRING = "01/01/2022";
    private final LocalDate DATA_BASE_MUNDO_REAL = LocalDate.parse(DATA_BASE_MUNDO_REAL_STRING, formatter);

    public DataDTO obterDataAtual() {
        DataDTO dataAtual = converterDataRealParaRedzay(LocalDate.now());
        return dataAtual;
    }

    public DataDTO obterProximoDia() {
        DataDTO dataAtual = converterDataRealParaRedzay(LocalDate.now());
        DataDTO proximoDia = obterProximoDia(dataAtual);

        return proximoDia;
    }

    /*
        Informa se o próximo dia é um dia maldito
     */
    private boolean isDataAnteriorDiaMaldito(DataDTO data) {

        for(DataAnteriorDiaMalditoEnum datasAnteriores : DataAnteriorDiaMalditoEnum.values()) {
            if(isDatasIguais(data, datasAnteriores.getData()))
                return true;
        }

        return false;
    }

    private boolean isDatasIguais(DataDTO dataA, DataDTO dataB) {
        if(dataA.getSemana().getNumero() == dataB.getSemana().getNumero()
        && dataA.getDia().getNumero() == dataB.getDia().getNumero()
        && dataA.getMes().getNumero() == dataB.getMes().getNumero()
        && dataA.getAno() == dataB.getAno()) {
            return true;
        }

        return false;
    }

    /*
        Verificar quantos dias se passaram entre uma data e outra
     */
    public Integer quantidadeDiasEntreDatas(DataDTO dataAnterior, DataDTO dataAtual) {
        final int numDiasAno = 365;

        //Converter a data em número dia do ano de Redzay
        Integer numDiaAnoAnterior = retornaDiaAno(dataAnterior);
        Integer numDiaAnoAtual = retornaDiaAno(dataAtual);

        if(numDiaAnoAnterior <= numDiaAnoAtual)
            return (numDiaAnoAtual - numDiaAnoAnterior);
        else
            return Math.abs((numDiaAnoAnterior - numDiaAnoAtual) - numDiasAno);
    }

    private Integer retornaDiaAno(DataDTO dataDTO) {
        return ((dataDTO.getMes().getNumero() - 1) * 24) + retornaDiaDoMes(dataDTO);
    }

    private Integer retornaDiaDoMes(DataDTO dataDTO) {
        return dataDTO.getDia().getNumero() * dataDTO.getSemana().getNumero();
    }

    public DataDTO somarDias(DataDTO data, Integer dias) {
        DataDTO novaData = data;

        for(int i = 1; i <= dias; i++) {
            novaData = obterProximoDia(novaData);
        }

        return novaData;
    }

    public DataDTO obterProximoDia(DataDTO dataAtual) {

        Integer novoDia = dataAtual.getDia().getNumero();
        Integer novaSemana = dataAtual.getSemana().getNumero();
        Integer novoMes = dataAtual.getMes().getNumero();
        Integer novoAno = dataAtual.getAno();

        // esse método tem que apenas montar o calendário, não pode fazer atualizações em banco
        if(isDataAnteriorDiaMaldito(dataAtual)) {
            DataDTO novaData = new DataDTO(dataAtual.getSemana(), DiaEnum.DIA_MALDITO, dataAtual.getMes(), novoAno, true);

            return novaData;
        } else {

            novoDia = novoDia + 1;

            if(novoDia > 6){
                novoDia = 1;
                novaSemana++;
            }

            if(novaSemana > 4) {
                novaSemana = 1;
                novoMes++;
            }

            if(novoMes > 15) {
                novoMes = 1;
                novoDia = 1;
                novoAno++;
            }

            DataDTO novaData = new DataDTO(SemanaEnum.findByNumero(novaSemana), DiaEnum.findByNumero(novoDia), MesEnum.findByNumero(novoMes), novoAno);

            return novaData;
        }
    }

    private DataDTO converterDataRealParaRedzay(LocalDate dataReal) {

        //Primeiro vejo quantos dias se passaram no mundo real
        long daysBetween = ChronoUnit.DAYS.between(DATA_BASE_MUNDO_REAL, dataReal);
        DataDTO dataBaseRedzay = obterDataBaseRedzay();

        DataDTO dataResultado = dataBaseRedzay;

        // Como tenho o número de dias, basta avançar o calendário esse número de dias.
        for(int i = 1; i <= daysBetween; i++) {
            dataResultado = obterProximoDia(dataResultado);
        }

        return dataResultado;
    }

    /*
    Obtém a primeira data do calendário de Redzay.
     */
    private final DataDTO  obterDataBaseRedzay() {
        final DataDTO dataBase = new DataDTO();

        dataBase.setSemana(PRIMEIRA_SEMANA);
        dataBase.setDia(PRIMEIRO_DIA);
        dataBase.setMes(PRIMEIRO_MES);
        dataBase.setAno(ANO_BASE);

        return dataBase;
    }

    private Integer avancaDia(Integer dia) {
        Integer novoDia = dia;
        novoDia++;

        if(novoDia > 6)
            novoDia = 1;

        return novoDia;
    }

    private Integer avancaSemana(Integer semana) {
        Integer novaSemana = semana;
        novaSemana++;

        if(novaSemana > 4)
            novaSemana = 1;

        return novaSemana;
    }

    private Integer avancaMes(Integer mes) {
        Integer novoMes = mes;
        novoMes++;

        if(novoMes > 15)
            novoMes = 1;

        return novoMes;
    }

}
