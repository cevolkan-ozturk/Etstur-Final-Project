package com.example.EtstourHotelBooking.services;

import com.example.EtstourHotelBooking.dto.ReservationDto;
import com.example.EtstourHotelBooking.entity.Reservation;
import com.example.EtstourHotelBooking.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;


    @Override
    public boolean upsertReservation(ReservationDto reservationDto) {

        Reservation reservation = new Reservation();

        reservation.setCustomerId(reservationDto.getUserId());
        reservation.setArrivalDate(reservationDto.getArrivalDate());
        reservation.setChildren(reservationDto.getChildren());
        reservation.setOpenbuffet(reservationDto.getOpenbuffet());
        reservation.setPersons(reservationDto.getPersons());
        reservation.setPrice(reservationDto.getPrice());
        reservation.setRoom(reservationDto.getRoomNo());
        reservation.setRooms(reservationDto.getRooms());
        reservation.setStayDays(reservationDto.getStayDays());
        reservation.setId(reservation.getId());

        reservationRepository.save(reservation);
        return true;
    }


}
