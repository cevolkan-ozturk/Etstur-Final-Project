package com.example.EtstourHotelBooking.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReservationInfoDto {

    private  ReservationDto reservationDto;
    private  CustomerDto customerDto;
}
