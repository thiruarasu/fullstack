package com.thiru.food_catalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiru.food_catalog.dto.FoodCatalog;
import com.thiru.food_catalog.dto.FoodItemDto;
import com.thiru.food_catalog.service.FoodCatalogueService;

@RestController
@RequestMapping("/foodCatalogue")
@CrossOrigin("http://localhost:4200/")
public class FoodCatalogueControlelr {
	
	@Autowired
	private FoodCatalogueService foodCatalogueService;
	
	@PostMapping("/addFoodItem")
	public ResponseEntity<FoodItemDto> addFoodItem(@RequestBody FoodItemDto foodItemDto)
	{
	return new ResponseEntity<>(foodCatalogueService.addFoodItem(foodItemDto),HttpStatus.CREATED);
	}
	
	@GetMapping("/fetchFoodItemsByRestaurantId/{id}")
	public ResponseEntity<FoodCatalog> fetchFoodItemsByRestaurantId(@PathVariable("id") Long id)
	{
		FoodCatalog foodCatalog=foodCatalogueService.fetchFoodItemsByRestaurantId(id);
		return new ResponseEntity<>(foodCatalog,HttpStatus.OK);
	 
	}
	
	
}
