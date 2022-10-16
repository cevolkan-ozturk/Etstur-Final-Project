package com.example.EtstourHotelBooking.dto;


import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GuestInfoDto {

    private String guestName;

    private String guestSurname;

    private Long identityNo;

    private String birthDay;

    private String gender ;

    private String ReservationNote;
}
