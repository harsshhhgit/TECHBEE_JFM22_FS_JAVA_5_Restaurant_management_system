package com.zira.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zira.restaurant.model.Inventory;
import com.zira.restaurant.repository.InventoryRepository;
import com.zira.restaurant.service.InventoryService;

@RestController
@CrossOrigin(allowedHeaders="*", origins="*")
public class InventoryController {
	
	@Autowired
	private InventoryService inventoryService;
	
	@PostMapping("/registerInventory")
	public void registerInventory(@RequestBody Inventory inventory) {
		inventoryService.registerInventory(inventory);
	}
	
	@GetMapping("/getInventorys")
	public List<Inventory> getInventory(){
		return inventoryService.getInventory();
	}
	
	@DeleteMapping("/deleteInventory")
	public void deleteInventory(@RequestParam Long ingredientId) {
		inventoryService.deleteInventory(ingredientId);
	}
	
	@PutMapping("/updateInventory")
	public Inventory updateInventory(@RequestBody Inventory inventory) {
		return inventoryService.updateInventory(inventory);
	}

}









