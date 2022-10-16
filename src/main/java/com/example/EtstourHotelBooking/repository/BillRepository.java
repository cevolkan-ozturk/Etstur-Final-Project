package com.example.EtstourHotelBooking.repository;


import com.example.EtstourHotelBooking.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<Bill,Long> {


}
