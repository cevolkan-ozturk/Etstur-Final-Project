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
@Table(name = "chief")

public class Chief {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chief_id")
    private long id;

    @Column(name = "chief_name")
    private String name;

    @Column(name = "chief_number")
    private Long phone ;

    @Column (name = "chief_location")
    private String location;

}
