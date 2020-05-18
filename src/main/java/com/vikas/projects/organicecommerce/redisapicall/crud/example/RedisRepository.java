package com.vikas.projects.organicecommerce.redisapicall.crud.example;

import java.util.Map;

public interface RedisRepository {
	
    Map<Object, Object> findAllMovies();
    void add(Movie movie);
    void delete(String id);
    Movie findMovie(String id);
}
