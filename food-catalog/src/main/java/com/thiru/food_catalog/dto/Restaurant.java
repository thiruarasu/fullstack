package com.thiru.food_catalog.dto;
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
public class Restaurant {
	private Long id;
	private String restaurantName;
	private String address;
	private String city;
	private String description;
}
