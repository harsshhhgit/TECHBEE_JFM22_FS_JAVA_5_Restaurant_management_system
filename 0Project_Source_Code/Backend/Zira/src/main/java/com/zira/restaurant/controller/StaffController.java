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

import com.zira.restaurant.model.Staff;
import com.zira.restaurant.repository.StaffRepository;
import com.zira.restaurant.service.StaffService;


//@RestController
//@RequestMapping("/api/v1/")
//public class StaffController {
// 
// @Autowired
// private StaffRepository staffRepository;
// 
//// get all staff
// @GetMapping("/staffs")
// public List<Staff> getAllStaffs(){
//  return staffRepository.findAll();
// }
// 
//}

@RestController
@CrossOrigin(allowedHeaders="*", origins="*")
public class StaffController {
 
 @Autowired
 private StaffService staffService;
 
 @PostMapping("/registerStaff")
 public void registerStaff(@RequestBody Staff staff) {
  staffService.registerStaff(staff);
 }
 
 @GetMapping("/getStaffs")
 public List<Staff> getStaff(){
	 return staffService.getStaff();
 }
 
 @DeleteMapping("/deleteStaff")
 public void deleteStaff(@RequestParam Long id) {
	 staffService.deleteStaff(id);
 }
 
 @PutMapping("/updateStaff")
 public Staff updateStaff(@RequestBody Staff staff) {
	 return staffService.updateStaff(staff);
 }
 
 
 
 
 
 
}



