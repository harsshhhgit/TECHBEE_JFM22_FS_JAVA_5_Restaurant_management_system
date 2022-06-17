package com.zira.restaurant.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zira.restaurant.model.OrderStatus;

@Repository
public interface OrderStatusRepository extends CrudRepository<OrderStatus, Long>{

}
