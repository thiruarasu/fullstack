package com.thiru.food_catalog.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity(name="fooditem")
public class FoodItem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long foodItemId;
	private String itemName;
	private String itemDescription;
	private boolean isVeg;
	private Double price;
	private Long restaurantId;
	@Column(nullable=false, columnDefinition="INT DEFAULT 0")
	private Integer qty;
	
	
	
	
	

}
