package com.vikas.projects.organicecommerce.redisapicall.repository;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.stereotype.Repository;

import com.vikas.projects.organicecommerce.redisapicall.models.ResponseFoodDetailsFromAPI;
import java.util.Base64;

@Repository
public class RedisRepositoryFoodDBImpl implements RedisRepositoryFoodDB{
	
	private RedisTemplate<String, Object> redisTemplate;
	private HashOperations hashOperation;
	private static final String KEY="FOOD";
	private ValueOperations valueOperations;
	@Autowired
	private JdkSerializationRedisSerializer jdkSerializationRedisSerializer;
	
	@Autowired
	public RedisRepositoryFoodDBImpl(RedisTemplate redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
	
	@PostConstruct
	public void init() {
		hashOperation = redisTemplate.opsForHash();
	}

	@Override
	public ResponseFoodDetailsFromAPI findByKey(String foodName) {
		String foodDetails = (String)hashOperation.get(KEY, foodName);
		if(foodDetails!=null) {
			 byte[] byte_array = Base64.getDecoder().decode(foodDetails);
				// byte[] byte_array = foodDetails.getBytes();
				ResponseFoodDetailsFromAPI o = (ResponseFoodDetailsFromAPI)jdkSerializationRedisSerializer.deserialize(byte_array);
			return o;
		}
		return null;
	}

	@Override
	public Boolean saveResponse(String foodName, ResponseFoodDetailsFromAPI foodDetails) {
		byte[] b = jdkSerializationRedisSerializer.serialize(foodDetails);
		String foodDetailString = Base64.getEncoder().encodeToString(b);
		return hashOperation.putIfAbsent(KEY, foodName, foodDetailString);
	}

	@Override
	public void deleteByKey(String key) {
		hashOperation.delete(KEY, key);
	}

}
