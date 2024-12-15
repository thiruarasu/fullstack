package com.thiru.food_catalog.dto;

import jakarta.persistence.Column;
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
public class FoodItemDto {
	private Long foodItemId;
	private String itemName;
	private String itemDescription;
	private boolean isVeg;
	private Double price;
	private Long restaurantId;
	@Column(nullable=false, columnDefinition="INT DEFAULT 0")
	private Integer qty;
}
