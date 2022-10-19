package com.example.EtstourHotelBooking.controller;

import com.example.EtstourHotelBooking.dto.OrderDto;
import com.example.EtstourHotelBooking.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class OrderController {

    private final CustomerService customerService;

    @PostMapping("/")
    public Boolean createOrder(@RequestBody OrderDto orderDto)
    {
        return customerService.orderFoodItem(orderDto);
    }
}
