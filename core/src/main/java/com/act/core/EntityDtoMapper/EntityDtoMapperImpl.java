package com.act.core.EntityDtoMapper;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EntityDtoMapperImpl implements EntityDtoMapper {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public <T> Class<T> entityDtoConverter(Object entity, Class<T> target) {
        return (Class<T>) modelMapper.map(entity,target);
    }
}
