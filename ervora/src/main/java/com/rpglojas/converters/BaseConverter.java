package com.rpglojas.converters;

public interface BaseConverter<T, R> {

    T convertToEntity(R dto);

    R convertToDTO(T entity);

}
