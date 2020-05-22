package com.vikas.projects.organicecommerce.redisapicall.models;

import java.io.Serializable;

public class Links implements Serializable{
	private static final long serialVersionUID = 3400297895916802765L;
	Next next;


	 // Getter Methods 

	 public Next getNext() {
	  return next;
	 }

	 // Setter Methods 

	 public void setNext(Next next) {
	  this.next = next;
	 }
	}
