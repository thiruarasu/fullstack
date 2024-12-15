package com.thiru.order_service.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.thiru.order_service.dto.FoodItemsDTO;
import com.thiru.order_service.dto.Restaurant;
import com.thiru.order_service.dto.UserDTO;

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
@Document("orderdetails")
public class Order {
	
	private Integer orderId;
    private List<FoodItemsDTO> foodItemsList;
    private Restaurant restaurant;
    private UserDTO userDTO;

}
