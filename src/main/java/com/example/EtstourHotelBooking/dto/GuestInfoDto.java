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
public class GuestInfoDto {

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String guestName;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String guestSurname;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private Long identityNo;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String birthDay;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String gender ;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String ReservationNote;
}
