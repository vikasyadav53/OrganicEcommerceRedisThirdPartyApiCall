package com.vikas.projects.organicecommerce.redisapicall.repository;

import com.vikas.projects.organicecommerce.redisapicall.models.ResponseFoodDetailsFromAPI;

public interface RedisRepositoryFoodDB {
	
	ResponseFoodDetailsFromAPI findByKey(String key);
	Boolean saveResponse(String key, ResponseFoodDetailsFromAPI foodDetails);
	void deleteByKey(String key);

}
