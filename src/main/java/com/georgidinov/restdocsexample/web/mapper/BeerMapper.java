package com.georgidinov.restdocsexample.web.mapper;

import com.georgidinov.restdocsexample.domain.Beer;
import com.georgidinov.restdocsexample.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}