package com.zira.restaurant.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "menu")
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "menu_seq")
	@SequenceGenerator(name = "menu_seq", initialValue = 1000)
	private long menuId;

	@Column(name = "menu_Name")
	private String name;

	@Column(name = "menu_url")
	private String url;

	@Column(name = "menu_quantity")
	private long quantity;

	@Column(name = "menu_status")
	private String status;

	@Column(name = "menu_price")
	private long price;

	@Column(name = "star_rating")
	private String stars;

	@Column(name = "cook_time")
	private String cookTime;

	@Column(name = "favorite")
	private String favorite;
	
	@Column(name = "origin")
	private String origin;

//	==============================================
//	=================Constructors=================
//	==============================================

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(long menuId, String name, String url, long quantity, String status, long price, String stars,
			String cookTime, String favorite, String origin) {
		super();
		this.menuId = menuId;
		this.name = name;
		this.url = url;
		this.quantity = quantity;
		this.status = status;
		this.price = price;
		this.stars = stars;
		this.cookTime = cookTime;
		this.favorite = favorite;
		this.origin = origin;
	}

//	==============================================
//	==============Getters and Setters=============
//	==============================================


	public long getMenuId() {
		return menuId;
	}

	public void setMenuId(long menuId) {
		this.menuId = menuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getStars() {
		return stars;
	}

	public void setStars(String stars) {
		this.stars = stars;
	}

	public String getCookTime() {
		return cookTime;
	}

	public void setCookTime(String cookTime) {
		this.cookTime = cookTime;
	}

	public String getFavorite() {
		return favorite;
	}

	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	

}
