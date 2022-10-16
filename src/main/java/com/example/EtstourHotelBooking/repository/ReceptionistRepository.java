package com.example.EtstourHotelBooking.repository;

import com.example.EtstourHotelBooking.entity.Receptionist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceptionistRepository extends JpaRepository<Receptionist,Long> {

}
