package com.example.EtstourHotelBooking.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderDetailDto {
    private  long id;
    private  long orderId;
    private  long foodId;
    private  int  foodCount;
    private  double foodPrice;
    private  String orderDetailsDescription;
}
