package com.yagoananias.anime.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yagoananias.anime.domain.Anime;
import com.yagoananias.anime.repositories.AnimeRepository;

@Service
public class AnimeService {
	
	@Autowired
	private AnimeRepository animeRepository;
	
	public Anime findById(Integer id) {
		Optional<Anime> anime = animeRepository.findById(id);
		return anime.orElse(null);
	}

	public List<Anime> findAll() {
		return animeRepository.findAll();
	}

	public Anime update(Integer id, Anime anime) {
		Anime novoAnime = findById(id);
		novoAnime.setName(anime.getName());
		novoAnime.setNumberOfEpisodes(anime.getNumberOfEpisodes());
		return animeRepository.save(novoAnime);
	}

	public Anime create(Anime anime) {
		anime.setId(null);
		return animeRepository.save(anime);
	}

	public void delete(Integer id) {
		findById(id);
		animeRepository.deleteById(id);
		
	}
}
