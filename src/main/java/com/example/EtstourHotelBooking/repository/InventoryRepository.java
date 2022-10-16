package com.example.EtstourHotelBooking.repository;


import com.example.EtstourHotelBooking.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Long> {

}
