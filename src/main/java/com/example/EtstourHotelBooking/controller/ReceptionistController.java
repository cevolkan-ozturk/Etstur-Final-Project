package com.example.EtstourHotelBooking.controller;

import com.example.EtstourHotelBooking.dto.ReservationDto;
import com.example.EtstourHotelBooking.entity.Reservation;
import com.example.EtstourHotelBooking.entity.Room;
import com.example.EtstourHotelBooking.services.ReceptionistService;
import com.example.EtstourHotelBooking.services.ReservationService;
import lombok.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReceptionistController {

    private final ReceptionistService receptionistService;

    private final ReservationService reservationService;


    @GetMapping("/all-room")
    public List<Room> getAllRoom(){
        return receptionistService.findAll();
    }

    @GetMapping("/room-by-status/{status}")
    public List<Room> getRoomByStatus(@PathVariable String status){
        return receptionistService.findRoomByStatus(status);
    }

    @PostMapping("/reservation")
    public Boolean createReservation (@RequestBody ReservationDto reservationDto) {
        return reservationService.upsertReservation(reservationDto);

    }

    @PutMapping("/reservation")
    public Boolean updateReservation (@RequestBody ReservationDto reservationDto) {
        return reservationService.upsertReservation(reservationDto);

    }

    @DeleteMapping("/reservation/{id}")
    public Boolean deleteReservation (@PathVariable int id) {
        return reservationService.deleteReservation(id);

    }

    @GetMapping("/reservation-list")
    public List<Reservation> getAllReservation(){
        return reservationService.getAllReservation();
    }

    @GetMapping("reservation/{id}")
    public Reservation getReservationById(@PathVariable int id){
        return reservationService.findReservationById(id);
    }
}
