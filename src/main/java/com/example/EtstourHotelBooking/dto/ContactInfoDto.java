package com.example.EtstourHotelBooking.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContactInfoDto {

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private Long phoneNumber;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String email;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String country;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String city;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String address;

}
