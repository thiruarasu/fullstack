package com.thiru.order_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.thiru.order_service.dto.OrderDTO;
import com.thiru.order_service.dto.OrderDTOFromFE;
import com.thiru.order_service.dto.Restaurant;
import com.thiru.order_service.dto.UserDTO;
import com.thiru.order_service.mapper.OrderMapper;
import com.thiru.order_service.model.Order;
import com.thiru.order_service.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	OrderRepository orderRepo;

    @Autowired
    SequenceGenerator sequenceGenerator;


    public OrderDTO saveOrderInDb(OrderDTOFromFE orderDetails) {
        Integer newOrderID = sequenceGenerator.generateNextOrderId();
        UserDTO userDTO = fetchUserDetailsFromUserId(orderDetails.getUserId());
        Restaurant restaurantObj=fetchRestaurantDetailsById(orderDetails.getRestaurantId());
        Order orderToBeSaved = new Order(newOrderID, orderDetails.getFoodItemsList(), restaurantObj, userDTO);
        Order ordersaved=orderRepo.save(orderToBeSaved);
        OrderDTO orderdto=new OrderDTO();
        orderdto.setOrderId(ordersaved.getOrderId());
        orderdto.setFoodItemsList(ordersaved.getFoodItemsList());
        orderdto.setRestaurant(ordersaved.getRestaurant());
        orderdto.setUserDTO(ordersaved.getUserDTO());
        return orderdto;
    }

    private Restaurant fetchRestaurantDetailsById(Long restaurantId) {
    	Restaurant restaurant=restTemplate.getForObject("http://localhost:9091/restuarant/"+restaurantId,Restaurant.class);
		return restaurant;
	}

	private UserDTO fetchUserDetailsFromUserId(Long userId) {
       return restTemplate.getForObject("http://localhost:9092/user/"+userId, UserDTO.class);
    }
}
