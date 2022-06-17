package com.zira.restaurant.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inventory_seq")
	@SequenceGenerator(name = "inventory_seq", initialValue = 2000)
	private long ingredientId;

	@Column(name = "ingredient_name")
	private String ingredientName;

	@Column(name = "type")
	private String type;

	@Column(name = "ingredient_quantity")
	private String ingredientQuantity;

	@Column(name = "supplier_id")
	private long supplierId;
//	==============================================
//	=================Constructors=================
//	==============================================

	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Inventory(long ingredientId, String ingredientName, String type, String ingredientQuantity,
			long supplierId) {
		super();
		this.ingredientId = ingredientId;
		this.ingredientName = ingredientName;
		this.type = type;
		this.ingredientQuantity = ingredientQuantity;
		this.supplierId = supplierId;
	}

//	==============================================
//	==============Getters and Setters=============
//	==============================================

	public long getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(long ingredientId) {
		this.ingredientId = ingredientId;
	}

	public String getIngredientName() {
		return ingredientName;
	}

	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}

	public String getIngredientQuantity() {
		return ingredientQuantity;
	}

	public void setIngredientQuantity(String ingredientQuantity) {
		this.ingredientQuantity = ingredientQuantity;
	}

	public long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}
