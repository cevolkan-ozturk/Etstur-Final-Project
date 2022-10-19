package com.example.EtstourHotelBooking.services;

import com.example.EtstourHotelBooking.dto.CheckInDto;
import com.example.EtstourHotelBooking.dto.CheckOutDto;
import com.example.EtstourHotelBooking.dto.OrderDto;
import com.example.EtstourHotelBooking.entity.Customer;

import java.util.List;

public interface CustomerService {

    //public Boolean checkIn(CheckInDto checkInDto);

    //public Boolean checkOut(CheckOutDto checkOutDto);

    public Boolean paysBill();

    public Boolean orderFoodItem(OrderDto orderDto);

    public boolean deleteCustomer (int id);

    public List<Customer> getAllCustomer();

    public Customer findCustomerById(int id);


}
