package com.act.core.EntityDtoMapper;

public interface EntityDtoMapper {
    <T> Class entityDtoConverter( Object entity,Class<T> target);
}
