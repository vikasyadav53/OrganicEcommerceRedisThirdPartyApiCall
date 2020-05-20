package com.vikas.projects.organicecommerce.redisapicall.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@Scope("prototype")
public class ResponseFoodDetailsFromAPI implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1927057943962033354L;
	String text;
	ArrayList<Parse> parsed;
	ArrayList<Hint> hints;
	Links _links;

	
	public ArrayList<Parse> getParsed() {
		return parsed;
	}
	public void setParsed(ArrayList<Parse> parsed) {
		this.parsed = parsed;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public ArrayList<Hint> getHints() {
		return hints;
	}

	public void setHints(ArrayList<Hint> hints) {
		this.hints = hints;
	}

	public Links get_links() {
		return _links;
	}

	public void set_links(Links _links) {
		this._links = _links;
	}
	
	
	

}
