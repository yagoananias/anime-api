package com.yagoananias.anime.adapter.dataprovider.entrypoint.controller;

import java.net.URI;
import java.util.List;

import com.yagoananias.anime.adapter.dataprovider.service.AnimeService;
import com.yagoananias.anime.domain.models.Anime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;



import lombok.Delegate;

@RestController
@RequestMapping(value = "/animes")
public class AnimeController {
	
	@Autowired
	private AnimeService animeService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Anime> get(@PathVariable Integer id) {
		
		Anime anime = this.animeService.findById(id);
		return ResponseEntity.ok().body(anime);
		
	}
	
	@GetMapping
	public ResponseEntity<List<Anime>> getAll() {
		
		List<Anime> listaAnimes = animeService.findAll();
		return ResponseEntity.ok().body(listaAnimes);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Anime> put(@PathVariable Integer id, @RequestBody Anime anime) {
		Anime novoAnime = animeService.update(id, anime);
		return ResponseEntity.ok().body(novoAnime);
	}
	
	@PostMapping
	public ResponseEntity<Anime> post(@RequestBody Anime anime) {
		Anime novoAnime = animeService.create(anime);
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(novoAnime.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		animeService.delete(id);
		return ResponseEntity.noContent().build();
	}

}
