package com.vikas.projects.organicecommerce.redisapicall.models;

import java.io.Serializable;

public class Food implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5933882633489466961L;
	private String foodId;
	private String label;
	Nutrients nutrients;
	private String brand;
	private String category;
	private String categoryLabel;
	private String foodContentsLabel;
	private String image;
	
	public String getFoodId() {
		return foodId;
	}
	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Nutrients getNutrientsObject() {
		return nutrients;
	}
	public void setNutrientsObject(Nutrients nutrientsObject) {
		nutrients = nutrientsObject;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategoryLabel() {
		return categoryLabel;
	}
	public void setCategoryLabel(String categoryLabel) {
		this.categoryLabel = categoryLabel;
	}
	public String getFoodContentsLabel() {
		return foodContentsLabel;
	}
	public void setFoodContentsLabel(String foodContentsLabel) {
		this.foodContentsLabel = foodContentsLabel;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}
