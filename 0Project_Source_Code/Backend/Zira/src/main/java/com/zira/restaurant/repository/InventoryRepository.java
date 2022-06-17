package com.zira.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.zira.restaurant.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{

}

