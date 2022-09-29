package com.omju.rickandmorty.api;

import com.omju.rickandmorty.Characters;
import feign.RequestLine;
import feign.QueryMap;
import java.util.List;
import java.util.Map;
import feign.Headers;

@Headers("Accept: application/json")
public interface ApiRickMorty {
    @RequestLine("GET /character")
    List<Characters> rickMortyCharacters(@QueryMap Map<String, Object> queryMap);
}
