package com.yagoananias.anime.adapter.dataprovider.service.client;

import com.yagoananias.anime.domain.models.Anime;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "animeServiceClient", url = "https://animechan.vercel.app/api/available/anime")
public interface AnimeServiceClient {

    @GetMapping()
    List<Anime> getAllAnimes();
}
