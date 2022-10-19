package com.example.EtstourHotelBooking.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

@Table(name = "reservation")
    public class Reservation {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "reservation_id")
        private int id;

        @Column(name = "reservation_room")
        private String room;

        @Column(name = "reservation_price")
        private double price;

        @Column(name = "reservation_num_of_rooms")
        private int rooms;

        @Column(name = "reservation_num_of_persons")
        private int persons;

        @Column(name = "reservation_num_of_children")
        private int children;

        @Column(name = "reservation_open_buffet")
        private String openbuffet;

        @Column(name = "reservation_from_date")
        private Date arrivalDate;

       @Column(name = "check_in_date")
        private Date checkInDate;

        @Column(name = "check_out_date")
        private Date checkOutDate;

        @Column(name = "reservation_stay_days")
        private int stayDays;

        @ManyToOne(fetch = FetchType.LAZY,optional = false)
        @JoinColumn(name = "customer_id", nullable = false)
        Customer customer;

}
