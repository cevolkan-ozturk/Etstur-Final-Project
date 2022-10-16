package com.example.EtstourHotelBooking.services;

import com.example.EtstourHotelBooking.dto.InventoryDto;
import com.example.EtstourHotelBooking.entity.Inventory;
import com.example.EtstourHotelBooking.exception.GenericNotFoundException;
import com.example.EtstourHotelBooking.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryServiceImpl implements InventoryService {

    private final InventoryRepository inventoryRepository;


    public InventoryServiceImpl(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @Override
    public Inventory upsertInventory (InventoryDto inventoryDto) {

        Inventory inventory = new Inventory();

        inventory.setId(inventoryDto.getId());
        inventory.setInventoryName(inventoryDto.getInventoryName());
        inventory.setInventoryType(inventoryDto.getInventoryType());
        inventory.setInventoryStatus(inventoryDto.getInventoryStatus());

        return inventoryRepository.save(inventory);
    }

    @Override
    public boolean deleteInventory(long id) {
        inventoryRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    @Override
    public Inventory findInventoryById(long id) throws GenericNotFoundException {

        Optional<Inventory> result = inventoryRepository.findById(id);
        if(result.isPresent()) {
            return result.get();
        }
        else {
            throw new GenericNotFoundException((int) id);
        }

    }
}
