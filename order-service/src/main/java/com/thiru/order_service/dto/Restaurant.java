package com.thiru.order_service.dto;

import java.util.List;

import com.thiru.order_service.model.Order;

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
public class Restaurant {
	private Long restaurantId;
	private String restaurantName;
	private String address;
	private String city;
	private String description;
}
