package com.vikas.projects.organicecommerce.redisapicall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrganicEcommerceRedisThirdPartyApiCallApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganicEcommerceRedisThirdPartyApiCallApplication.class, args);
	}

	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {// acts like Redis client
		return new JedisConnectionFactory();// can provide host and port name in this constructor as well.
	}

	@Bean
	public RedisTemplate<String, Object> redisTemplate() {
		RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
		redisTemplate.setConnectionFactory(jedisConnectionFactory());
		return redisTemplate;
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public JdkSerializationRedisSerializer getRedisSerializer() {
		return new JdkSerializationRedisSerializer();
	}

}
