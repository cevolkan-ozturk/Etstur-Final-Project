package com.example.EtstourHotelBooking.services;

import com.example.EtstourHotelBooking.dto.InventoryDto;
import com.example.EtstourHotelBooking.entity.Inventory;

import java.util.List;

public interface InventoryService {

    public Inventory upsertInventory(InventoryDto inventoryDto);

    public boolean deleteInventory(long id);

    public List<Inventory> getAllInventory();

    public Inventory findInventoryById(long id);

}

