package com.example.EtstourHotelBooking.dto;

import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private int id;
    private int customerId;
    private int roomId;
    private Date orderDate;
    private String orderStatus;
    private String orderDeliveryDate;
    private String orderDescription;
    private List<OrderDetailDto> orderDetailDtos;
}
