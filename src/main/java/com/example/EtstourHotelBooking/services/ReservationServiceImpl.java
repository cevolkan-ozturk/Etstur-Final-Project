package com.example.EtstourHotelBooking.services;

import com.example.EtstourHotelBooking.dto.ReservationDto;
import com.example.EtstourHotelBooking.entity.Reservation;
import com.example.EtstourHotelBooking.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;


    @Override
    public boolean upsertReservation(ReservationDto reservationDto) {

        Reservation reservation = new Reservation();

        reservation.setId(reservationDto.getId());
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

    @Override
    public boolean deleteReservation(int id) {
        reservationRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservationRepository.findAll();
    }


}
