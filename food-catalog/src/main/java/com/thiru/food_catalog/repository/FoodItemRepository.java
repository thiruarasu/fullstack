package com.thiru.food_catalog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.thiru.food_catalog.model.FoodItem;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
	List<FoodItem> findByRestaurantId(Long id);
}
