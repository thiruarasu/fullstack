package com.thiru.order_service.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class OrderDTOFromFE {
	private List<FoodItemsDTO> foodItemsList;
    private Long userId;
    private Long restaurantId;
}
