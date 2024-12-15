package com.thiru.order_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiru.order_service.dto.OrderDTO;
import com.thiru.order_service.dto.OrderDTOFromFE;
import com.thiru.order_service.service.OrderService;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/order")
public class OrderController {

	 @Autowired
	    OrderService orderService;

	    @PostMapping("/saveOrder")
	    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTOFromFE orderDetails){
	    	System.out.println("restaurant id "+orderDetails.getRestaurantId());
//	    	orderDetails.setRestaurantId(orderDetails.getRestaurantId());
	    	OrderDTO orderSavedInDB = orderService.saveOrderInDb(orderDetails);
	        return new ResponseEntity<>(orderSavedInDB, HttpStatus.CREATED);
	    }
}
