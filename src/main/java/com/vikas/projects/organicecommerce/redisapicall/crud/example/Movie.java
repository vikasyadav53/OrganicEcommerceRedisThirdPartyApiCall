package com.vikas.projects.organicecommerce.redisapicall.crud.example;

import java.io.Serializable;

public class Movie implements Serializable{

	private String id;
	private String name;
	
	public Movie(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
