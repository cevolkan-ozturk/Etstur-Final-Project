package com.example.EtstourHotelBooking.services;

import com.example.EtstourHotelBooking.dto.CustomerDto;
import com.example.EtstourHotelBooking.dto.ReservationDto;
import com.example.EtstourHotelBooking.entity.Customer;
import com.example.EtstourHotelBooking.entity.Reservation;
import com.example.EtstourHotelBooking.exception.GenericNotFoundException;
import com.example.EtstourHotelBooking.repository.CustomerRepository;
import com.example.EtstourHotelBooking.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    private final CustomerRepository customerRepository;


    @Override
    public boolean upsertReservation(ReservationDto reservationDto, CustomerDto customerDto) {

        Customer customer = new Customer();

        customer.setId(customerDto.getId());
        customer.setIdentityNo(customerDto.getIdentityNo());
        customer.setCustomerName(customerDto.getCustomerName());
        customer.setCustomerSurname(customerDto.getCustomerSurname());
        customer.setCustomerPhoneNumber(customerDto.getCustomerPhoneNumber());
        customer.setAddress(customerDto.getAddress());
        customer.setRoomNo(customerDto.getRoomNo());

        Customer customerNewRecord = customerRepository.save(customer);


        Reservation reservation = new Reservation();

        reservation.setId(reservationDto.getId());
        reservation.setCustomer(customerNewRecord);
        reservation.setArrivalDate(reservationDto.getArrivalDate());
        reservation.setCheckInDate(reservationDto.getCheckInDate());
        reservation.setCheckOutDate(reservationDto.getCheckOutDate());
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

    @Override
    public Reservation findReservationById(int id) throws GenericNotFoundException  {

        Optional<Reservation> result = reservationRepository.findById(id);
        if(result.isPresent()) {
            return result.get();
        }
        else {
           throw new GenericNotFoundException(id);
        }
    }




}
