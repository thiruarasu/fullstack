package com.thiru.restaurant_service.mapper;

import org.mapstruct.factory.Mappers;

import com.thiru.restaurant_service.dto.RestaurantDto;
import com.thiru.restaurant_service.model.Restaurant;

public interface RestaurantMappers {

	RestaurantMappers INSTANCE=Mappers.getMapper(RestaurantMappers.class);

	Restaurant mapDtoToRestaurant(Restaurant savedrestaurant);
	RestaurantDto mapRestaurantToDto(Restaurant restaurant);
	
}
