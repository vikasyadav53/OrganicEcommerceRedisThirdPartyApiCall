package com.vikas.projects.organicecommerce.redisapicall.models;

import java.io.Serializable;

public class Nutrients implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8207662942326982309L;
	private float ENERC_KCAL;
	private float PROCNT;
	private float FAT;
	private float CHOCDF;
	private float FIBTG;
	public float getENERC_KCAL() {
		return ENERC_KCAL;
	}
	public void setENERC_KCAL(float eNERC_KCAL) {
		ENERC_KCAL = eNERC_KCAL;
	}
	public float getPROCNT() {
		return PROCNT;
	}
	public void setPROCNT(float pROCNT) {
		PROCNT = pROCNT;
	}
	public float getFAT() {
		return FAT;
	}
	public void setFAT(float fAT) {
		FAT = fAT;
	}
	public float getCHOCDF() {
		return CHOCDF;
	}
	public void setCHOCDF(float cHOCDF) {
		CHOCDF = cHOCDF;
	}
	public float getFIBTG() {
		return FIBTG;
	}
	public void setFIBTG(float fIBTG) {
		FIBTG = fIBTG;
	}
	
	
}
