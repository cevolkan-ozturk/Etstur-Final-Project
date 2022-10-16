package com.example.EtstourHotelBooking.repository;

import com.example.EtstourHotelBooking.entity.Chief;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiefRepository extends JpaRepository<Chief,Long> {
}
