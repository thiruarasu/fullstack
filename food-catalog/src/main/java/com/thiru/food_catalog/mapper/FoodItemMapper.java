package com.thiru.food_catalog.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.thiru.food_catalog.dto.FoodItemDto;
import com.thiru.food_catalog.model.FoodItem;

@Mapper
public interface FoodItemMapper {

	FoodItemMapper INSTANCE = Mappers.getMapper(FoodItemMapper.class);
	
	FoodItem mapFoodItemDtoToFoodItem(FoodItemDto foodItemDto);	
	
	FoodItemDto mapFoodItemToFoodItemDto(FoodItem foodItem);
	
}
