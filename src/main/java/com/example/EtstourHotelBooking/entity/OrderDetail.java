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
@Table(name = "order_details")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_details_id")
    private long id;

    @Column (name = "order_id")
    private long orderId;

    @Column (name = "food_id")
    private long foodId;

    @Column (name = "food_count")
    private int foodCount;

    @Column (name = "food_price")
    private double foodPrice;

    @Column (name = "order_details_description")
    private String orderDetailsDescription;

}
