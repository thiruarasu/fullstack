package com.thiru.order_service.dto;

import org.springframework.data.mongodb.core.mapping.Document;

import com.thiru.order_service.model.Sequence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "sequence")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodItemsDTO {
	private Long  foodItemId;
    private String itemName;
    private String itemDescription;
    private boolean isVeg;
    private Long price;
    private Integer restaurantId;
    private Integer quantity;
}
