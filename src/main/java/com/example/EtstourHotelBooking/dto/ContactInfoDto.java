package com.example.EtstourHotelBooking.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContactInfoDto {

    private Long phoneNumber;

    private String email;

    private String country;

    private String city;

    private String address;

}
