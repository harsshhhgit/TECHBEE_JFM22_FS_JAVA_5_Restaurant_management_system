package com.zira.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zira.restaurant.model.Menu;

@Repository
public interface MenuRepository extends CrudRepository<Menu, Long>{

}
