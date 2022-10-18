package com.example.EtstourHotelBooking.services;

import com.example.EtstourHotelBooking.entity.*;
import com.example.EtstourHotelBooking.exception.GenericNotFoundException;
import com.example.EtstourHotelBooking.repository.BillRepository;
import com.example.EtstourHotelBooking.repository.CustomerRepository;
import com.example.EtstourHotelBooking.repository.ReservationRepository;
import com.example.EtstourHotelBooking.repository.RoomRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReceptionistServiceImpl implements ReceptionistService {

    private final RoomRepository roomRepository;
    private final BillRepository billRepository;
    private final ReservationRepository reservationRepository;
    private final CustomerRepository customerRepository;

    public ReceptionistServiceImpl(RoomRepository roomRepository, BillRepository billRepository, ReservationRepository reservationRepository, CustomerRepository customerRepository) {
        this.roomRepository = roomRepository;
        this.billRepository = billRepository;
        this.reservationRepository = reservationRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    @Transactional
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    @Override
    @Transactional
    public List<Room> findRoomByStatus(String status){
        return roomRepository.findAllByStatus(status);
    }

    @Override
    @Transactional
    public Bill GenerateBill(int reservationId){

        Bill bill = new Bill();

        Optional<Reservation> reservation = reservationRepository.findById(reservationId);
        if(reservation.isEmpty()) {
            throw new GenericNotFoundException(reservationId);
        }

        Optional<Customer> customer = customerRepository.findById(reservation.get().getCustomerId());
        if(customer.isEmpty()) {
            throw new GenericNotFoundException(reservationId);
        }

        bill.setCustomerId(reservation.get().getCustomerId());
        bill.setCustomerName(customer.get().getCustomerName());
        bill.setCustomerSurname(customer.get().getCustomerSurname());
        bill.setBillDate(new Date());
        bill.setPrice(reservation.get().getPrice());

        return billRepository.save(bill);
    }

    @Override
    public Boolean CheckIn(int reservationId) throws GenericNotFoundException {

       Optional<Reservation> reservation = reservationRepository.findById(reservationId);
       if(reservation.isPresent()) {
           reservation.get().setCheckInDate(new Date());
           reservationRepository.save(reservation.get());
           return true;
       }
       else {
            throw new GenericNotFoundException(reservationId);
        }

    }

    @Override
    public Boolean Checkout(int reservationId) throws GenericNotFoundException {
        Optional<Reservation> reservation = reservationRepository.findById(reservationId);
        if(reservation.isPresent()) {
            reservation.get().setCheckOutDate(new Date());
            reservationRepository.save(reservation.get());
            return true;
        }
        else {
            throw new GenericNotFoundException(reservationId);
        }
    }

    @Override
    public Boolean orderFoodItems(List<FoodItems> foodItems) {

        return null;
    }

}
