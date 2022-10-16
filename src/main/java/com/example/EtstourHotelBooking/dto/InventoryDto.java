package com.example.EtstourHotelBooking.dto;

import lombok.*;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InventoryDto {



    private long id;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String inventoryName;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String inventoryType;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String inventoryStatus;

}
