package com.example.EtstourHotelBooking.dto;


import lombok.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CheckOutDto {

    private long reservationId;

    private String guestName;

    private String guestSurname;

    private Long identityNo;

}
