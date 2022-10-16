package com.example.EtstourHotelBooking.exception;

public class GenericNotFoundException extends RuntimeException{

    public  GenericNotFoundException(int id) {
        super("Bu id'ye ait bir kayıt bulunamadı! " + id);
    }
}
