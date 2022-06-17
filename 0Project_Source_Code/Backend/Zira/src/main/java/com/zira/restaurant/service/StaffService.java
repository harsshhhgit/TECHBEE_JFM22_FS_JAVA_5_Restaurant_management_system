package com.zira.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zira.restaurant.model.Staff;
import com.zira.restaurant.repository.StaffRepository;

@Service
public class StaffService {
 
 @Autowired
 private StaffRepository staffRepository;
 
 public Staff registerStaff(Staff staff) {
  return staffRepository.save(staff);
 }
 
 public List<Staff> getStaff(){
	 return (List<Staff>) staffRepository.findAll();
 }

 public void deleteStaff(Long id) {
	 staffRepository.deleteById(id);
 }
 
 public Staff updateStaff(Staff staff) {
	 Long id = staff.getId();
	 Staff std = staffRepository.findById(id).get();
	 std.setFirstName(staff.getFirstName());
	 std.setLastName(staff.getLastName());
	 std.setDesignation(staff.getDesignation());
	 std.setEmailId(staff.getEmailId());
	 std.setPhoneNumber(staff.getPhoneNumber());
	 return staffRepository.save(std);
 }
 
 
}