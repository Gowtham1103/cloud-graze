package com.gowatr.cloudgraze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CloudgrazeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudgrazeApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer config(){
		return new WebMvcConfigurer() {
			public void addCorsMapping(CorsRegistry reg){
				reg.addMapping("/**").allowedOrigins("*");
			}
		};
	}

}
