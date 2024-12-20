package com.thiru.restaurant_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RestaurantDto {
	private Long id;
	private String restaurantName;
	private String address;
	private String City;
	private String description;
}
