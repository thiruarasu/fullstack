package com.thiru.order_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.thiru.order_service.model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order,Integer>{

}
