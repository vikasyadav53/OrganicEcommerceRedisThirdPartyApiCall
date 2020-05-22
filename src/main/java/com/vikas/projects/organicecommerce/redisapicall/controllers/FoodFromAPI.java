package com.vikas.projects.organicecommerce.redisapicall.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.vikas.projects.organicecommerce.redisapicall.models.ResponseFoodDetailsFromAPI;
import com.vikas.projects.organicecommerce.redisapicall.services.CacheManagementService;

@RestController
@RequestMapping(value = "food/")
public class FoodFromAPI {

	@Autowired
	private ResponseFoodDetailsFromAPI responseFoodDetailsFromAPI;
	private Boolean isSaved;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private CacheManagementService cacheManagementService;

	@RequestMapping(value = "foodName/{food_name}", method = RequestMethod.GET)
	public ResponseFoodDetailsFromAPI getFoodDetailsFromFoodAPI(@PathVariable("food_name") String foodName) {
		String urlO = "https://api.edamam.com/api/food-database/parser?ingr=" + foodName
				+ "&app_id=4cbdcd98&app_key=c25eb72c019b5f0d4505cd0dd0baec3b";
		responseFoodDetailsFromAPI = cacheManagementService.checkIfAvailableInCache(foodName);
		if (responseFoodDetailsFromAPI == null) {
			responseFoodDetailsFromAPI = restTemplate.getForObject(urlO, ResponseFoodDetailsFromAPI.class);
			if (responseFoodDetailsFromAPI != null) {
				cacheManagementService.saveFoodDetails(foodName, responseFoodDetailsFromAPI);
			}
		}
		return responseFoodDetailsFromAPI;
	}
}
