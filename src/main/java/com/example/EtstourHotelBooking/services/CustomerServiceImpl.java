package com.example.EtstourHotelBooking.services;

import com.example.EtstourHotelBooking.dto.OrderDetailDto;
import com.example.EtstourHotelBooking.dto.OrderDto;
import com.example.EtstourHotelBooking.entity.Customer;
import com.example.EtstourHotelBooking.entity.Order;
import com.example.EtstourHotelBooking.entity.OrderDetail;
import com.example.EtstourHotelBooking.exception.GenericNotFoundException;
import com.example.EtstourHotelBooking.repository.CustomerRepository;
import com.example.EtstourHotelBooking.repository.OrderDetailRepository;
import com.example.EtstourHotelBooking.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {


    private final CustomerRepository customerRepository;
    private final OrderRepository orderRepository;
    private final OrderDetailRepository orderDetailRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository, OrderRepository orderRepository, OrderDetailRepository orderDetailRepository) {
        this.customerRepository = customerRepository;
        this.orderRepository = orderRepository;
        this.orderDetailRepository = orderDetailRepository;
    }



    @Override
    public Boolean paysBill() {
        return null;
    }

    @Override
    public Boolean orderFoodItem(OrderDto orderDto) {

        //Order
        Order order = new Order();
        order.setId(orderDto.getId());
        order.setCustomerId(orderDto.getCustomerId());
        order.setOrderDate(orderDto.getOrderDate());
        order.setRoomId(orderDto.getRoomId());
        order.setOrderStatus(orderDto.getOrderStatus());
        order.setOrderDescription(orderDto.getOrderDescription());
        order.setOrderDeliveryDate(null);
        orderRepository.save(order);

        //Order Detail
        List<OrderDetail> orderDetails = new ArrayList<>();

        for (OrderDetailDto orderDetailDto : orderDto.getOrderDetailDtos())
        {
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setId(orderDetailDto.getId());
            orderDetail.setFoodId(orderDetailDto.getFoodId());
            orderDetail.setFoodCount(orderDetailDto.getFoodCount());
            orderDetail.setFoodPrice(orderDetailDto.getFoodPrice());
            orderDetail.setOrderDetailsDescription(orderDetailDto.getOrderDetailsDescription());
            orderDetail.setOrderId(order.getId());
            orderDetails.add(orderDetail);
        }
        orderDetailRepository.saveAll(orderDetails);

        return true;
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
