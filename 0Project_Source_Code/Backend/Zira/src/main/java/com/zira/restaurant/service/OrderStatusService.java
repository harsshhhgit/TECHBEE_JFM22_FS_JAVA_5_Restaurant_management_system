package com.zira.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zira.restaurant.model.Feedback;
import com.zira.restaurant.model.OrderStatus;
import com.zira.restaurant.repository.OrderStatusRepository;

@Service
public class OrderStatusService {

	@Autowired
	private OrderStatusRepository orderStatusRepository;
	
	public OrderStatus registerOrder(OrderStatus orderStatus) {
		return orderStatusRepository.save(orderStatus);
	}

	public List<OrderStatus> getOrderStatus() {
		return (List<OrderStatus>) orderStatusRepository.findAll();
	}

	public void deleteOrderStatus(Long orderId) {
		orderStatusRepository.deleteById(orderId);
	}

}
