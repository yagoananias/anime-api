package com.yagoananias.anime.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagoananias.anime.domain.Anime;

public interface AnimeRepository extends JpaRepository<Anime, Integer> {

}
