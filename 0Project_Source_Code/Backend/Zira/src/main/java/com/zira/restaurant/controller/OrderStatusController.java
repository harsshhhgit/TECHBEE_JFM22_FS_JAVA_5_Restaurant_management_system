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
import com.zira.restaurant.model.OrderStatus;
import com.zira.restaurant.model.Staff;
import com.zira.restaurant.repository.OrderStatusRepository;
import com.zira.restaurant.service.OrderStatusService;


@RestController
@CrossOrigin(allowedHeaders="*", origins="*")
public class OrderStatusController {
	
	@Autowired
	private OrderStatusService orderStatusService;
	
	@PostMapping("/registerOrder")
	public void registerOrder(@RequestBody OrderStatus orderStatus) {
		orderStatusService.registerOrder(orderStatus);
	}
	
	@GetMapping("/getOrderStatuss")
	 public List<OrderStatus> getOrderStatus(){
		 return orderStatusService.getOrderStatus();
	 }
	 
	 @DeleteMapping("/deleteOrderStatus")
	 public void deleteOrderStatus(@RequestParam Long orderId) {
		 orderStatusService.deleteOrderStatus(orderId);
	 }

}
