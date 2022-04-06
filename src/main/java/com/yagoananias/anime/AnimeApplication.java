package com.yagoananias.anime;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yagoananias.anime.domain.Anime;
import com.yagoananias.anime.repositories.AnimeRepository;

@SpringBootApplication
public class AnimeApplication implements CommandLineRunner{
	
	@Autowired
	private AnimeRepository animeRepository;

	public static void main(String[] args) {
		SpringApplication.run(AnimeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Anime a1 = new Anime(null, "Naruto", 200);
		Anime a2 = new Anime(null, "Bleach", 100);
		animeRepository.saveAll(Arrays.asList(a1, a2));
		
	}

}
