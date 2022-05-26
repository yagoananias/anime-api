package com.yagoananias.anime.adapter.dataprovider.service;

import com.yagoananias.anime.adapter.dataprovider.service.client.AnimeServiceClient;
import com.yagoananias.anime.domain.models.Anime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeServiceImpl implements AnimeService {

    @Autowired
    private AnimeServiceClient animeServiceClient;

    @Override
    public List<Anime> getAllAnimes() {
        return animeServiceClient.getAllAnimes();
    }
}
