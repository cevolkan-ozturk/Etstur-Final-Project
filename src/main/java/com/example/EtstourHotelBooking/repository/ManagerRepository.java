package com.example.EtstourHotelBooking.repository;

import com.example.EtstourHotelBooking.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Manager,Long> {

}
