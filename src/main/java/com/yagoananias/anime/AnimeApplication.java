package com.yagoananias.anime;

import java.util.Arrays;

import com.yagoananias.anime.adapter.dataprovider.repository.AnimeRepository;
import com.yagoananias.anime.domain.models.Anime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


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
