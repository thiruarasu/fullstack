package com.thiru.restaurant_service.repoitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiru.restaurant_service.model.Restaurant;


@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Long>{

}
