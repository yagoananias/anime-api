package com.yagoananias.anime.adapter.dataprovider.service;

import java.util.List;
import java.util.Optional;

import com.yagoananias.anime.adapter.dataprovider.repository.AnimeRepository;
import com.yagoananias.anime.domain.models.Anime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



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
		Anime newAnime = findById(id);
		newAnime.setName(anime.getName());
		newAnime.setNumberOfEpisodes(anime.getNumberOfEpisodes());
		return animeRepository.save(newAnime);
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
