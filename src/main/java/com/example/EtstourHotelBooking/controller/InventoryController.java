package com.example.EtstourHotelBooking.controller;


import com.example.EtstourHotelBooking.dto.InventoryDto;
import com.example.EtstourHotelBooking.dto.ReservationDto;
import com.example.EtstourHotelBooking.entity.Inventory;
import com.example.EtstourHotelBooking.services.InventoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;


    @GetMapping("/all-inventory")
    public List<Inventory> getAllInventory() {
        return inventoryService.getAllInventory();
    }

    @PutMapping("/inventory")
    public Inventory updateInventory(@RequestBody InventoryDto inventoryDto) {
        return inventoryService.upsertInventory(inventoryDto);
    }

    @PostMapping("/inventory")
    public Inventory createInventory (@RequestBody InventoryDto inventoryDto) {
        return inventoryService.upsertInventory(inventoryDto);
    }

    @DeleteMapping("/inventory/{id}")
    public Boolean deleteInventory (@PathVariable int id) {
        return inventoryService.deleteInventory(id);
    }

    @GetMapping("/inventory/{id}")
    public Inventory getInventoryById(@PathVariable int id){
        return inventoryService.findInventoryById(id);
    }

}
