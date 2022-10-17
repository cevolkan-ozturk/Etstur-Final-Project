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
public class CustomerDto {

    private long id;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String customerName;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private long customerPhoneNumber;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String address;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String roomNo;


}
