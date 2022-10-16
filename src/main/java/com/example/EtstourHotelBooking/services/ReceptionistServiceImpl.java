package com.example.EtstourHotelBooking.services;

import com.example.EtstourHotelBooking.entity.Bill;
import com.example.EtstourHotelBooking.entity.Room;
import com.example.EtstourHotelBooking.repository.BillRepository;
import com.example.EtstourHotelBooking.repository.RoomRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReceptionistServiceImpl implements ReceptionistService {

    private final RoomRepository roomRepository;

    private final BillRepository billRepository;

    public ReceptionistServiceImpl(RoomRepository roomRepository, BillRepository billRepository) {
        this.roomRepository = roomRepository;
        this.billRepository = billRepository;
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
    public Bill GenerateBill(Long billNo){
        return new Bill();
    }


    @Override
    @Transactional
    public Bill GenerateBill2(Long customerId){
        return new Bill();
    }

}
