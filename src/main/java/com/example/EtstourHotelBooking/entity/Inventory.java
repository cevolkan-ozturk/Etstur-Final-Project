package com.example.EtstourHotelBooking.entity;


import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "inventory")

public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "inventory_id")
    private long id;

    @Column (name = "inventory_type")
    private String inventoryType;

    @Column(name = "inventory_status")
    private String inventoryStatus;

}
