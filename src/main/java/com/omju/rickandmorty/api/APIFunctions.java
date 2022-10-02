package com.omju.rickandmorty.api;

import feign.gson.GsonDecoder;
import feign.Feign;

public class APIFunctions {
    public static <T> T buildAPI(Class<T> clazz, String url) {
        return Feign.builder().decoder(new GsonDecoder()).target(clazz, url);
    }
}
