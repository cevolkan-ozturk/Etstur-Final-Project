package com.example.EtstourHotelBooking.services;

import com.example.EtstourHotelBooking.dto.CheckInDto;
import com.example.EtstourHotelBooking.dto.CheckOutDto;
import com.example.EtstourHotelBooking.dto.GuestInfoDto;
import com.example.EtstourHotelBooking.entity.Customer;
import com.example.EtstourHotelBooking.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {


    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }



    @Override
    public Boolean paysBill() {
        return null;
    }

    @Override
    public Boolean orderFoodItem() {
        return null;
    }

}
