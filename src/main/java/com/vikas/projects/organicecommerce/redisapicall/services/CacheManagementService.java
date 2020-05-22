package com.vikas.projects.organicecommerce.redisapicall.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikas.projects.organicecommerce.redisapicall.models.ResponseFoodDetailsFromAPI;
import com.vikas.projects.organicecommerce.redisapicall.repository.RedisRepositoryFoodDB;

@Service
public class CacheManagementService {
	
	@Autowired
	RedisRepositoryFoodDB redisRepositoryFoodDB;
	
	public Boolean saveFoodDetails(String foodName, ResponseFoodDetailsFromAPI responseFoodDetailsFromAPI) {
		return redisRepositoryFoodDB.saveResponse(foodName, responseFoodDetailsFromAPI );
	}
	
	public ResponseFoodDetailsFromAPI checkIfAvailableInCache(String foodName) {
		return redisRepositoryFoodDB.findByKey(foodName);
	}
 
}
