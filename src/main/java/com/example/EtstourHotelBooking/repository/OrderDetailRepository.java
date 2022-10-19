package com.example.EtstourHotelBooking.repository;

import com.example.EtstourHotelBooking.entity.Order;
import com.example.EtstourHotelBooking.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail,Long> {
}
