package com.vikas.projects.organicecommerce.redisapicall.models;


import java.io.Serializable;
import java.util.List;

public class ParsesList implements Serializable{
	private static final long serialVersionUID = 5902036842725888370L;
	List<Parse> parse;
	public List<Parse> getParse() {
		return parse;
	}
	public void setParse(List<Parse> parse) {
		this.parse = parse;
	}	

}
