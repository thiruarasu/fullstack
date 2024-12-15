package com.thiru.food_catalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.thiru.food_catalog.dto.FoodCatalog;
import com.thiru.food_catalog.dto.FoodItemDto;
import com.thiru.food_catalog.dto.Restaurant;
import com.thiru.food_catalog.model.FoodItem;
import com.thiru.food_catalog.repository.FoodItemRepository;

@Service
public class FoodCatalogueService {

	@Autowired
	FoodItemRepository foodItemRepository;
	
	@Autowired
	RestTemplate restTemplate;

	public FoodItemDto addFoodItem(FoodItemDto foodItemDto) {
		FoodItem foodItemnew=FoodItem.builder()
				.itemName(foodItemDto.getItemName())
				.itemDescription(foodItemDto.getItemDescription())
				.isVeg(foodItemDto.isVeg())
				.price(foodItemDto.getPrice())
				.restaurantId(foodItemDto.getRestaurantId())
				.qty(foodItemDto.getQty()).build();
		FoodItem foodItemsaved=foodItemRepository.save(foodItemnew);
		return new FoodItemDto(foodItemsaved.getFoodItemId(),foodItemsaved.getItemName(),foodItemsaved.getItemDescription(),foodItemsaved.isVeg(),foodItemsaved.getPrice(),foodItemsaved.getRestaurantId(),foodItemsaved.getQty());
	}

	public FoodCatalog fetchFoodItemsByRestaurantId(Long id) {
		List<FoodItem> foodItems=fetchFoodItemListByRestuarantId(id);
		Restaurant restaurantObj=fetchRestaurantDetailsById(id);
		FoodCatalog foodCatalog=FoodCatalog.builder()
				.foodItemsList(foodItems)
				.restuarant(restaurantObj)
				.build();
		return foodCatalog;
	}

	private Restaurant fetchRestaurantDetailsById(Long id) {
		Restaurant restaurant=restTemplate.getForObject("http://restaurant-service/restaurant/"+id,Restaurant.class);
		return restaurant;
	}
	
	private List<FoodItem> fetchFoodItemListByRestuarantId(Long id) {
		return foodItemRepository.findByRestaurantId(id);
	}
	
}
