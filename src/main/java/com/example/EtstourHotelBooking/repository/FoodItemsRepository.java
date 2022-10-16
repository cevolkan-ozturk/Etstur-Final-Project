package com.example.EtstourHotelBooking.repository;

import com.example.EtstourHotelBooking.entity.FoodItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemsRepository extends JpaRepository<FoodItems,Long> {

}
