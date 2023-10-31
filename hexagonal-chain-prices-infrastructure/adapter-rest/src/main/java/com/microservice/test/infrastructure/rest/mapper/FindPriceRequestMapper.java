package com.microservice.test.infrastructure.rest.mapper;

import com.microservice.test.api.dto.v1.FindPriceRequestDTO;
import com.microservice.test.domain.entity.FindPriceRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FindPriceRequestMapper {

    FindPriceRequest toDomain(FindPriceRequestDTO source);

}
