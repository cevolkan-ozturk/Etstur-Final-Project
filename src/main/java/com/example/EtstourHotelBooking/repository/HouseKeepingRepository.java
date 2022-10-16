package com.example.EtstourHotelBooking.repository;

import com.example.EtstourHotelBooking.entity.HouseKeeping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseKeepingRepository extends JpaRepository<HouseKeeping,Long> {

}
