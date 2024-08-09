package com.example.urllookup.service;

import com.example.urllookup.model.UrlInfo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class UrlLookupService {
    private static final String API_KEY = "qAYUcQSJwv2uPCSxY1KAFQ==4F0cTftfajc7c2n4";
    private static final String API_URL = "https://api.api-ninjas.com/v1/urllookup?url=";

    public UrlInfo lookupUrl(String url) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL + url))
                .header("X-Api-Key", API_KEY)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        return gson.fromJson(response.body(), UrlInfo.class);
    }
}