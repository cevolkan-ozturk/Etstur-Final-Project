package com.example.EtstourHotelBooking.services;

import com.example.EtstourHotelBooking.dto.CheckInDto;
import com.example.EtstourHotelBooking.dto.CheckOutDto;

public interface CustomerService {

    //public Boolean checkIn(CheckInDto checkInDto);

    //public Boolean checkOut(CheckOutDto checkOutDto);

    public Boolean paysBill();

    public Boolean orderFoodItem();


}
