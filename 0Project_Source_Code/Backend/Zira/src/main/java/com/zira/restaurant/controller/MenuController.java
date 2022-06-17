package com.zira.restaurant.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

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

import com.zira.restaurant.model.Menu;
import com.zira.restaurant.repository.MenuRepository;
import com.zira.restaurant.service.MenuService;


@RestController
@CrossOrigin(allowedHeaders="*", origins="*")
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	
	 @PostMapping("/registerMenu")
	 public void registerMenu(@RequestBody Menu menu) {
	  menuService.registerMenu(menu);
	 }
	 
	 @GetMapping("/getMenus")
	 public List<Menu> getMenu(){
		 return menuService.getMenu();
	 }
	 
	 @DeleteMapping("/deleteMenu")
	 public void deleteMenu(@RequestParam Long menuId) {
		 menuService.deleteMenu(menuId);
	 }
	 
	 @PutMapping("/updateMenu")
	 public Menu updateMenu(@RequestBody Menu menu) {
		 return menuService.updateMenu(menu);
	 }
}




