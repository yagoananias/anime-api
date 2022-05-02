package com.yagoananias.anime.adapter.dataprovider.repository;

import com.yagoananias.anime.domain.models.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimeRepository extends JpaRepository<Anime, Integer> {

}
