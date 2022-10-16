package com.example.EtstourHotelBooking.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReservationDto {



    private int id;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String roomNo;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private double price;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private int rooms;

    @NotNull (message = "is required")
    @Size(min=1, message = "is required")
    private int persons ;

    private int children;

    private String openbuffet;

    @NotNull(message = "is required")
    @Size(min=1, message = "is requrired")
    private Date arrivalDate;

    @NotNull(message = "is required")
    @Size(min=1, message = "is requrired")
    private int stayDays;

    @NotNull(message = "is required")
    @Size(min=1, message = "is requrired")
    private int userId;



}
