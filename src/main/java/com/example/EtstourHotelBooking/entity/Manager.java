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
@Table(name = "manager")
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manager_id")
    private long id;

    @Column(name = "manager_name")
    private String managerName;

    @Column(name = "manager_phone")
    private long managerPhoneNumber ;


    @Column(name = "manager_location")
    private String location;
}
