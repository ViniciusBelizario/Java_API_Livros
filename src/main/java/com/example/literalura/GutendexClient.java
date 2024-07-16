package com.example.literalura;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class GutendexClient {

    private static final String BASE_URL = "https://gutendex.com/books/";

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String url = UriComponentsBuilder.fromHttpUrl(BASE_URL)
                .queryParam("author", "Mark Twain")
                .build()
                .toString();

        String response = restTemplate.getForObject(url, String.class);
        System.out.println(response);
    }
}
