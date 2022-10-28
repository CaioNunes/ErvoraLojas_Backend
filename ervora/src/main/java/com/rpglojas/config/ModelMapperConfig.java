package com.rpglojas.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
//
//        modelMapper.createTypeMap(ItemDTO.class, Item.class)
//                .<Long>addMapping(src -> src.getIdQualidadeItem(),
//                        (dest, value) -> dest.setQualidadeItem(new ItemQualidade(value)))
//                .<Long>addMapping(src -> src.getIdTipoItem(),
//                        (dest, value) -> dest.setTipoItem(new ItemTipo(value)));

        return modelMapper;
    }
}
