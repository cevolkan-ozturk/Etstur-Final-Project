package com.example.EtstourHotelBooking.services;

import com.example.EtstourHotelBooking.dto.CustomerDto;
import com.example.EtstourHotelBooking.dto.ReservationDto;
import com.example.EtstourHotelBooking.entity.Reservation;

import java.util.List;

public interface ReservationService {

    public boolean upsertReservation (ReservationDto reservationDto, CustomerDto customerDto);

    public boolean deleteReservation (int id);

    public List<Reservation> getAllReservation ();

    public Reservation findReservationById(int id);




}
