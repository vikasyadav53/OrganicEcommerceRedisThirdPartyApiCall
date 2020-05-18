package com.vikas.projects.organicecommerce.redisapicall.crud.example;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class RedisRepositoryImpl implements RedisRepository {
	
	private static final String KEY="Movies";
	
	private RedisTemplate<String, Object> redisTemplate;
	private HashOperations hashOperation;
	
	@Autowired
	public RedisRepositoryImpl(RedisTemplate redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
	
	@PostConstruct
	private void init() {
		this.hashOperation = this.redisTemplate.opsForHash();
	}

	@Override
	public Map<Object, Object> findAllMovies() {
		return hashOperation.entries(KEY);
	}

	@Override
	public void add(Movie movie) {
		hashOperation.put(KEY, movie.getId(), movie.getName());
		
	}

	@Override
	public void delete(String id) {
		hashOperation.delete(KEY, id);		
	}

	@Override
	public Movie findMovie(String id) {
		return (Movie) hashOperation.get(KEY, id);
	}

}
