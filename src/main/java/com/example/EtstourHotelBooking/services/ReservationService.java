package com.example.EtstourHotelBooking.services;

import com.example.EtstourHotelBooking.dto.ReservationDto;
import com.example.EtstourHotelBooking.entity.Reservation;

import java.util.List;

public interface ReservationService {

    public boolean upsertReservation (ReservationDto reservationDto);

    public boolean deleteReservation (int id);

    public List<Reservation> getAllReservation ();




}
