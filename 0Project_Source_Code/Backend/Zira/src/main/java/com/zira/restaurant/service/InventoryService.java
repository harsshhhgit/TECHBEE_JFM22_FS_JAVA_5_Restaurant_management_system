package com.zira.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zira.restaurant.model.Inventory;
import com.zira.restaurant.repository.InventoryRepository;

@Service
public class InventoryService {
	
	@Autowired
	private InventoryRepository inventoryRepository;
	
	public Inventory registerInventory(Inventory inventory) {
		return inventoryRepository.save(inventory);
	}
	
	public List<Inventory> getInventory(){
		return (List<Inventory>) inventoryRepository.findAll();
	}
	
	public void deleteInventory(Long ingredientId) {
		inventoryRepository.deleteById(ingredientId);
	}
	
	public Inventory updateInventory(Inventory inventory) {
		Long id = inventory.getIngredientId();
		Inventory itd = inventoryRepository.findById(id).get();
		itd.setIngredientName(inventory.getIngredientName());
		itd.setType(inventory.getType());
		itd.setIngredientQuantity(inventory.getIngredientQuantity());
		itd.setSupplierId(inventory.getSupplierId());
		return inventoryRepository.save(itd);
	}

}















