package com.zira.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zira.restaurant.model.Staff;

//@Repository
//public interface StaffRepository extends JpaRepository<Staff, Long>{
//
//}

@Repository
public interface StaffRepository extends CrudRepository<Staff, Long>{

}