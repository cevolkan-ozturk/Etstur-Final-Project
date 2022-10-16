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
@Table(name = "house_keeps")

public class HouseKeeping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "housekeep_id")
    private long id;

    @Column(name = "housekeep_name")
    private String name;

    @Column(name = "housekeep_location")
    private String location;

}
