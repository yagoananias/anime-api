package com.yagoananias.anime.adapter.dataprovider.entrypoint.controller;

import com.yagoananias.anime.adapter.dataprovider.service.AnimeService;
import com.yagoananias.anime.domain.models.Anime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class AnimeController {
	
	@Autowired
	private AnimeService animeService;

	@GetMapping
	public List<Anime> getAllAnimes() {
		return animeService.getAllAnimes();
	}

}
