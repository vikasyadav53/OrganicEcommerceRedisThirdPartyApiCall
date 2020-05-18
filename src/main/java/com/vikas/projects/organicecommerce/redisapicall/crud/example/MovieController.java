package com.vikas.projects.organicecommerce.redisapicall.crud.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "movies")
public class MovieController {

	@Autowired
	private RedisRepository redisRepository;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<String> add(@RequestParam String key, @RequestParam String value) {
		Movie movie = new Movie(key, value);
		redisRepository.add(movie);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/values")
	public Map<String, String> findAll() {
		Map<Object, Object> aa = redisRepository.findAllMovies();
		Map<String, String> map = new HashMap<String, String>();
		for (Map.Entry<Object, Object> entry : aa.entrySet()) {
			String key = (String) entry.getKey();
			map.put(key, aa.get(key).toString());
		}
		return map;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public ResponseEntity<String> delete(@RequestParam String key) {
		redisRepository.delete(key);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
