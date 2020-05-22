package com.vikas.projects.organicecommerce.redisapicall.models;

import java.io.Serializable;

public class Next implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3162650203043153567L;
	private String title;
	private String href;

	// Getter Methods

	public String getTitle() {
		return title;
	}

	public String getHref() {
		return href;
	}

	// Setter Methods

	public void setTitle(String title) {
		this.title = title;
	}

	public void setHref(String href) {
		this.href = href;
	}
}
