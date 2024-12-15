package com.thiru.food_catalog.dto;

import java.util.List;
import com.thiru.food_catalog.model.FoodItem;
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
public class FoodCatalog {
	
	private List<FoodItem> foodItemsList;
	private Restaurant restuarant;
	
}
