package com.thiru.restaurant_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.thiru.restaurant_service.dto.RestaurantRequest;
import com.thiru.restaurant_service.dto.RestaurantResponse;
import com.thiru.restaurant_service.model.Restaurant;
import com.thiru.restaurant_service.service.RestaurantService;
import com.thiru.restaurant_service.service.util.RestaurantNotFoundException;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/restaurant")
public class RestuarantController {

	@Autowired
	private RestaurantService restuarantService;
	
	@PostMapping("/addRestaurant")
	public ResponseEntity<RestaurantResponse> addRestaurant(@RequestBody RestaurantRequest request)
	{
		return new ResponseEntity<>(restuarantService.addRestaurant(request),HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<RestaurantResponse> updateRestaurant(@PathVariable("id") Long id,@RequestBody Restaurant restaurant) throws RestaurantNotFoundException
	{
		return new ResponseEntity<>(restuarantService.updateRestaurant(id,restaurant),HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllRestuarant")
	public ResponseEntity<List<Restaurant>> getAllRestuarant()
	{
		return new ResponseEntity<>(restuarantService.getAllRestaurant(),HttpStatus.OK);
	}
		
	@GetMapping("/{id}")
	public ResponseEntity<RestaurantResponse> getRestuarantById(@PathVariable("id") Long id) throws Exception
	{
		return new ResponseEntity<>(restuarantService.getRestaurantById(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteRestuarantById(@PathVariable("id") Long id) throws Exception
	{
		return new ResponseEntity<>(restuarantService.deleteRestuarantById(id),HttpStatus.OK);
	}
	
}
