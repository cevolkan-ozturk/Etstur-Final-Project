package com.example.EtstourHotelBooking.services;

import com.example.EtstourHotelBooking.dto.CheckInDto;
import com.example.EtstourHotelBooking.dto.CheckOutDto;
import com.example.EtstourHotelBooking.dto.GuestInfoDto;
import com.example.EtstourHotelBooking.entity.Customer;
import com.example.EtstourHotelBooking.exception.GenericNotFoundException;
import com.example.EtstourHotelBooking.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public boolean deleteCustomer(int id) {
        customerRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }


    @Override
    public Customer findCustomerById(int id) throws GenericNotFoundException {
        Optional<Customer> result = customerRepository.findById(id);
        if(result.isPresent()) {
            return result.get();
        }
        else {
            throw new GenericNotFoundException(id);
        }
    }

}
