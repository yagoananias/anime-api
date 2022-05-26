package com.yagoananias.anime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class AnimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimeApplication.class, args);
	}


}
