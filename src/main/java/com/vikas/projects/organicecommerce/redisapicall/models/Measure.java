package com.vikas.projects.organicecommerce.redisapicall.models;

import java.io.Serializable;

public class Measure implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6139417401889578181L;
	private String uri;
	 private String label;


	 // Getter Methods 

	 public String getUri() {
	  return uri;
	 }

	 public String getLabel() {
	  return label;
	 }

	 // Setter Methods 

	 public void setUri(String uri) {
	  this.uri = uri;
	 }

	 public void setLabel(String label) {
	  this.label = label;
	 }

}
