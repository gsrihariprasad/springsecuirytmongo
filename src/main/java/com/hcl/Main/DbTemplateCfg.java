package com.hcl.Main;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;

@Configuration
// @EnableAutoConfiguration
// @EntityScan("com.hcl")
public class DbTemplateCfg {

	public @Bean MongoTemplate mongoTemplate() throws Exception {

		MongoTemplate mongoTemplate = new MongoTemplate(new MongoClient("localhost"), "netlinkaut");
		return mongoTemplate;

	}

}
