package com.example.EtstourHotelBooking.services;

import com.example.EtstourHotelBooking.entity.Bill;
import com.example.EtstourHotelBooking.entity.FoodItems;
import com.example.EtstourHotelBooking.entity.Room;

import java.util.List;

public interface ReceptionistService {


    public List<Room> findAll();

    public List<Room> findRoomByStatus(String status);

    public Bill GenerateBill(int reservationId);

    public Boolean CheckIn(int reservationId);

    public Boolean Checkout(int reservationId);

    public Boolean orderFoodItems (List<FoodItems> foodItems );

}
