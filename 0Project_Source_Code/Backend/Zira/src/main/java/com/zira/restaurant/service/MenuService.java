package com.zira.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zira.restaurant.model.Menu;
import com.zira.restaurant.repository.MenuRepository;

@Service
public class MenuService {

	@Autowired
	private MenuRepository menuRepository;

	public Menu registerMenu(Menu menu) {
		return menuRepository.save(menu);
	}

	public List<Menu> getMenu() {
		return (List<Menu>) menuRepository.findAll();
	}

	public void deleteMenu(Long id) {
		menuRepository.deleteById(id);
	}

	public Menu updateMenu(Menu menu) {
			 Long menuId = menu.getMenuId();
			 Menu med = menuRepository.findById(menuId).get();
			 med.setName(menu.getName());
			 med.setUrl(menu.getUrl());
			 med.setQuantity(menu.getQuantity());
			 med.setStatus(menu.getStatus());
			 med.setPrice(menu.getPrice());
			 med.setCookTime(menu.getCookTime());
			 med.setFavorite(menu.getFavorite());
			 med.setStars(menu.getStars());
			 med.setOrigin(menu.getOrigin());
			 return menuRepository.save(med);
	}	 

}
