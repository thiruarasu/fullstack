package com.thiru.restaurant_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiru.restaurant_service.dto.RestaurantRequest;
import com.thiru.restaurant_service.dto.RestaurantResponse;
import com.thiru.restaurant_service.model.Restaurant;
import com.thiru.restaurant_service.repoitory.RestaurantRepository;
import com.thiru.restaurant_service.service.util.RestaurantNotFoundException;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantRepository restaurantRepository;

	public List<Restaurant> getAllRestaurant() {
		List<Restaurant> result=restaurantRepository.findAll();
		return result;
	}

	public RestaurantResponse addRestaurant(RestaurantRequest restaurant) {
	Restaurant reqRestaurant=Restaurant.builder()
				.restaurantName(restaurant.restaurantName())
				.address(restaurant.address())
				.city(restaurant.city())
				.description(restaurant.description()).build();
	Restaurant savedRestaurant=restaurantRepository.save(reqRestaurant);
		return new RestaurantResponse(savedRestaurant.getId(),savedRestaurant.getRestaurantName(),savedRestaurant.getAddress(),savedRestaurant.getCity(),savedRestaurant.getDescription());
	}

	public RestaurantResponse getRestaurantById(Long id) throws Exception {
		Optional<Restaurant> restaurant=restaurantRepository.findById(id);
		if(restaurant==null)
		{
			throw new RestaurantNotFoundException("No Restuarnt found for id "+id);
		}
		return new RestaurantResponse(restaurant.get().getId(),restaurant.get().getRestaurantName(),restaurant.get().getAddress(),restaurant.get().getCity(),restaurant.get().getDescription());
	}

	public String deleteRestuarantById(Long id) throws RestaurantNotFoundException {
		Optional<Restaurant> restaurant=restaurantRepository.findById(id);
		String result="";
		if(restaurant==null)
		{
			throw new RestaurantNotFoundException("No Restuarnt found for id "+id);
		} else {
			restaurantRepository.deleteById(id);
			result="Restuarnt Deleted Successfully for id "+id;
		}
		return result;
	}

	public RestaurantResponse updateRestaurant(Long id, Restaurant restaurant) throws RestaurantNotFoundException {
		Optional<Restaurant> exrestaurant=restaurantRepository.findById(id);
		if(restaurant==null)
		{
			throw new RestaurantNotFoundException("No Restuarnt found for id "+id);
		} 
		Restaurant updateRestaurant=Restaurant.builder()
				.id(id)
				.restaurantName(restaurant.getRestaurantName())
				.address(restaurant.getAddress())
				.city(restaurant.getCity())
				.description(restaurant.getDescription()).build();
		Restaurant updatedRestaurant=restaurantRepository.save(updateRestaurant);
		return new RestaurantResponse(updatedRestaurant.getId(),updatedRestaurant.getRestaurantName(),updatedRestaurant.getAddress(),updatedRestaurant.getCity(),updatedRestaurant.getDescription());
	}	
}
