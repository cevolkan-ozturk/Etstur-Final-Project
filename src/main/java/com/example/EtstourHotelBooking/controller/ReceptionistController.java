package com.example.EtstourHotelBooking.controller;

import com.example.EtstourHotelBooking.dto.CustomerDto;
import com.example.EtstourHotelBooking.dto.ReservationDto;
import com.example.EtstourHotelBooking.dto.ReservationInfoDto;
import com.example.EtstourHotelBooking.entity.Bill;
import com.example.EtstourHotelBooking.entity.Customer;
import com.example.EtstourHotelBooking.entity.Reservation;
import com.example.EtstourHotelBooking.entity.Room;
import com.example.EtstourHotelBooking.exception.GenericNotFoundException;
import com.example.EtstourHotelBooking.services.CustomerService;
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
    public Boolean createReservation (@RequestBody ReservationInfoDto reservationInfoDto) {
        return reservationService.upsertReservation(reservationInfoDto.getReservationDto(),reservationInfoDto.getCustomerDto());

    }

    @PutMapping("/reservation")
    public Boolean updateReservation (@RequestBody ReservationInfoDto reservationInfoDto) {
        return reservationService.upsertReservation(reservationInfoDto.getReservationDto(),reservationInfoDto.getCustomerDto());

    }

    @DeleteMapping("/reservation/{id}")
    public Boolean deleteReservation (@PathVariable int id) {
        return reservationService.deleteReservation(id);

    }

    @GetMapping("/reservation-list")
    public List<Reservation> getAllReservation(){
        return reservationService.getAllReservation();
    }

    @GetMapping("/reservation/{id}")
    public Reservation getReservationById(@PathVariable int id){
        return reservationService.findReservationById(id);
    }

    @PutMapping("/reservation-check-in/{reservationId}")
    public Boolean checkInByReservationId(@PathVariable int reservationId) throws GenericNotFoundException
    {
        return receptionistService.CheckIn(reservationId);
    }

    @PutMapping("/reservation-check-out/{reservationId}")
    public Boolean checkOutByReservationId(@PathVariable int reservationId)
    {
        return receptionistService.Checkout(reservationId);
    }

    @GetMapping("/reservation-generate-bill/{reservationId}")
    public Bill generateBillByReservationId(@PathVariable int reservationId){
        return receptionistService.GenerateBill(reservationId);
    }

}
